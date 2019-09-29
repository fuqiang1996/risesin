package com.risesin.enterpriseuserservice.financingplan.controller;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.risesin.common.vo.resultVo.R;
import com.risesin.enterpriseuserservice.financingplan.bo.FinancingPlanBO;
import com.risesin.service.modules.actionplan.serviceimpl.FinImpPlanServiceImpl;
import com.risesin.service.modules.core.serviceImpl.FinancingPlanServiceImpl;
import com.risesin.service_api.modules.actionPlan.entity.FinImpPlan;
import com.risesin.service_api.modules.core.entity.FinancingPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>企业端融资方案管理</p>
 *
 * @author : honey
 * @date : 2019-09-24 16:27
 **/
@RestController
@RequestMapping("/enterprise")
public class FinancingPlanController {

    @Autowired
    private FinImpPlanServiceImpl finImpPlanService;

    @Autowired
    private FinancingPlanServiceImpl financingPlanService;


    @GetMapping("/getFinancingPlan")
    @ResponseBody
    public R getFinancingPlan(@RequestParam String commonUserId) {
        Long delFlag = -1L;
        List<FinancingPlan> financingPlanList = financingPlanService.findByDelFlagAndCommonUserId(delFlag, Long.valueOf(commonUserId));
        Map<String, Object> map = new HashMap<>();
        map.put("data", financingPlanList);
        return R.ok(map);
    }

    @PostMapping("/make")
    public String makePdf(@RequestBody FinancingPlanBO bo) throws IOException, DocumentException {
        // 模板路径
        String templatePath = "F:/planTemp.pdf";
        // 生成的新文件路径
        String newPDFPath = "F:/planTemplateSuccess.pdf";
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        try {
            out = new FileOutputStream(newPDFPath);// 输出流
            reader = new PdfReader(templatePath);// 读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            /**
             * 使用中文字体 如果是利用 AcroFields填充值的不需要在程序中设置字体，在模板文件中设置字体为中文字体就行了
             */
            BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",
                    BaseFont.NOT_EMBEDDED);
            ArrayList<BaseFont> list = new ArrayList<BaseFont>();
            list.add(bf);
            AcroFields form = stamper.getAcroFields();
            form.setSubstitutionFonts(list);
            form.setField("planApplicantTel", bo.getPlanApplicantTel());
            form.setField("planApplicant", bo.getPlanApplicant());
            form.setField("templateStart", bo.getTemplateStart());
            form.setField("main", bo.getMain());
            form.setField("content", bo.getContent());
            form.setField("templateEnd", bo.getTemplateEnd());
            System.out.println(form.getFields());
//            form.setField("debenturesAddress", bo.getDebenturesAddress());
//            form.setField("obligor", bo.getObligor());
//            form.setField("obligorLegalRepresentative", bo.getObligorLegalRepresentative());
//            form.setField("obligorLegalRepresentativeAddress", bo.getObligorLegalRepresentativeAddress());
//            form.setField("signYear", bo.getSignYear());
//            form.setField("signMonth", bo.getSignMonth());
//            form.setField("signDay", bo.getSignDay());
//            form.setField("protocol", bo.getProtocal());


            stamper.setFormFlattening(true);// 如果为false那么生成的PDF文件还能编辑，一定要设为true
            stamper.close();

            Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(new PdfReader(bos.toByteArray()), 1);
            copy.addPage(importPage);
            doc.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            System.out.println("close");
        }
        return null;
    }


    /**
     * 新增或修改
     */
    @PostMapping("/submit")
    @ResponseBody
    public String submit(@RequestBody FinImpPlan plan) {
        System.out.println(plan);
        finImpPlanService.add(plan);
        return "增加成功";
    }

    @GetMapping("/findBy")
    @ResponseBody
    public List<FinImpPlan> findBy() {
        List<FinImpPlan> all = finImpPlanService.findAll();
        return all;
    }

    @GetMapping("/findByEntUser")
    @ResponseBody
    public List<FinImpPlan> findByEntUserPlan(@RequestParam Long userId) {
        List<FinImpPlan> all = finImpPlanService.findByEntUserPlan(userId);
        return all;
    }


}
