package com.risesin.common.utils.httpclient;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URI;
import java.net.URLEncoder;
import java.util.*;

/**
 * @AUTHOR Baby
 * @CREATE 2019/9/24
 * @DESCRIPTION 请求工具类
 * @since 1.0.0
 */
public class HttpRequestUtil {
    private  static final Logger logger = LoggerFactory.getLogger(HttpRequestUtil.class);

    /**
     * 封装HTTP POST方法
     *
     * @param
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String post(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        //设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
        httpPost.setConfig(requestConfig);
        List<NameValuePair> formparams = setHttpParams(paramMap);
        UrlEncodedFormEntity param = new UrlEncodedFormEntity(formparams, "UTF-8");
        httpPost.setEntity(param);
        HttpResponse response = httpClient.execute(httpPost);
        logger.info("************{}", response);
        String httpEntityContent = getHttpEntityContent(response);
        logger.info("************{}", httpEntityContent);
        httpPost.abort();
        logger.info("************{}", httpEntityContent);
        return httpEntityContent;

    }

    /**
     * 封装HTTP POST方法
     *
     * @param
     * @param （如JSON串）
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String post(String url, String data) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        //设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
        httpPost.setConfig(requestConfig);
        httpPost.setHeader("Content-Type", "text/json; charset=utf-8");
        httpPost.setEntity(new StringEntity(URLEncoder.encode(data, "UTF-8")));
        HttpResponse response = httpClient.execute(httpPost);
        String httpEntityContent = getHttpEntityContent(response);
        httpPost.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP POST方法
     * @param url url
     * @param headerParams http 头
     * @param params 参数
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String post(String url, Map<String,String> headerParams , Map<String,String> params) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        //设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
        httpPost.setConfig(requestConfig);
        // 设置http 头
        headerParams.entrySet().forEach(entry -> httpPost.addHeader(entry.getKey(),entry.getValue()));

        List<NameValuePair> nvps = new ArrayList<>();
        // 设置参数
        params.entrySet().forEach(entry ->nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue())));

        httpPost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));

        HttpResponse response = httpClient.execute(httpPost);
        String httpEntityContent = getHttpEntityContent(response);
        httpPost.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP GET方法
     *
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String get(String url) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet();
        //设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
        httpGet.setConfig(requestConfig);
        httpGet.setURI(URI.create(url));
        HttpResponse response = httpClient.execute(httpGet);
        String httpEntityContent = getHttpEntityContent(response);
        httpGet.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP GET方法
     *
     * @param
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String get(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet();
        //设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
        httpGet.setConfig(requestConfig);

        List<NameValuePair> nvps = new ArrayList<>();
        // 设置参数
        paramMap.entrySet().forEach(entry ->nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue())));

        String param = URLEncodedUtils.format(nvps, "UTF-8");
        httpGet.setURI(URI.create(url + "?" + param));
        HttpResponse response = httpClient.execute(httpGet);
        String httpEntityContent = getHttpEntityContent(response);
        httpGet.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP PUT方法
     *
     * @param
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String put(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPut httpPut = new HttpPut(url);
        //设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
        httpPut.setConfig(requestConfig);
        List<NameValuePair> formparams = setHttpParams(paramMap);
        UrlEncodedFormEntity param = new UrlEncodedFormEntity(formparams, "UTF-8");
        httpPut.setEntity(param);
        HttpResponse response = httpClient.execute(httpPut);
        String httpEntityContent = getHttpEntityContent(response);
        httpPut.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP DELETE方法
     *
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String delete(String url) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpDelete httpDelete = new HttpDelete();
        //设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
        httpDelete.setConfig(requestConfig);
        httpDelete.setURI(URI.create(url));
        HttpResponse response = httpClient.execute(httpDelete);
        String httpEntityContent = getHttpEntityContent(response);
        httpDelete.abort();
        return httpEntityContent;
    }

    /**
     * 封装HTTP DELETE方法
     *
     * @param
     * @param
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     */
    public static String delete(String url, Map<String, String> paramMap) throws ClientProtocolException, IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpDelete httpDelete = new HttpDelete();
        //设置请求和传输超时时间
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).build();
        httpDelete.setConfig(requestConfig);
        List<NameValuePair> formparams = setHttpParams(paramMap);
        String param = URLEncodedUtils.format(formparams, "UTF-8");
        httpDelete.setURI(URI.create(url + "?" + param));
        HttpResponse response = httpClient.execute(httpDelete);
        String httpEntityContent = getHttpEntityContent(response);
        httpDelete.abort();
        return httpEntityContent;
    }


    /**
     * 设置请求参数
     *
     * @param
     * @return
     */
    private static List<NameValuePair> setHttpParams(Map<String, String> paramMap) {
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        Set<Map.Entry<String, String>> set = paramMap.entrySet();
        for (Map.Entry<String, String> entry : set) {
            formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        return formparams;
    }

    /**
     * 获得响应HTTP实体内容
     *
     * @param response
     * @return
     * @throws IOException
     * @throws UnsupportedEncodingException
     */
    private static String getHttpEntityContent(HttpResponse response) throws IOException, UnsupportedEncodingException {
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            InputStream is = entity.getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String line = br.readLine();
            StringBuilder sb = new StringBuilder();
            while (line != null) {
                sb.append(line + "\n");
                line = br.readLine();
            }
            return sb.toString();
        }
        return "";
    }
}
