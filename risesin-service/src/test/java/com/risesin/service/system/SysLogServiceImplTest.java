package com.risesin.service.system;

import com.risesin.service.RisesinServiceApplicationTests;
import com.risesin.service.modules.system.serviceImpl.SysLogServiceImpl;
import com.risesin.service_api.modules.system.entity.SysLog;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class SysLogServiceImplTest extends RisesinServiceApplicationTests {

    @Autowired
    private SysLogServiceImpl sysLogService;

    @Test
    public void findAll() {
        List<SysLog> all = sysLogService.findAll();
        for (SysLog sysLog : all) {
            System.out.println(sysLog);
        }
    }

    @Test
    public void findById() {
        SysLog sysLog = sysLogService.findById(1L);
        System.out.println(sysLog);
    }

    @Test
    public void add() {
        SysLog sysLog = new SysLog();
        sysLog.setFkLogUserId(1001L)
                .setAddTime(new Date())
                .setLogIp("192.168.1.1")
                .setLogMethod("wx")
                .setLogOperation("operation")
                .setLogTime(10000L)
                .setLogUsername("hha")
                .setId(10L);
        sysLogService.add(sysLog);
    }

    @Test
    public void update() {
        SysLog sysLog = sysLogService.findById(1L);
        sysLog.setLogParams("web");
        sysLogService.update(sysLog);
    }
}