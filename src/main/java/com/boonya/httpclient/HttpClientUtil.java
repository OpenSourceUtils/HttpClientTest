package com.boonya.httpclient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @ClassName: HttpClientUtil
 * @Description: TODO(HttpClientUtil工具类)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-07-19
 */
public class HttpClientUtil{

    /**
     * get请求，参数拼接在地址上
     * @param url 请求地址加参数
     * @return 响应
     */
    public static String get(String url)
    {
        String result = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        get.addHeader("Content-Type","application/json; charset=utf-8");
        get.setHeader("Accept", "application/json");
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(get);
            if(response != null && response.getStatusLine().getStatusCode() == 200)
            {
                HttpEntity entity = response.getEntity();
                result =entity.getContent().toString();
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpClient.close();
                if(response != null)
                {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static  String  post(String url,String jsonParams){
        HttpClient httpClient =HttpClients.createDefault();
        HttpPost httpPost=new HttpPost(url);
        httpPost.addHeader("Content-Type","application/json; charset=utf-8");
        httpPost.setHeader("Accept", "application/json");
        httpPost.setEntity(new StringEntity(jsonParams, Charset.forName("UTF-8")));
        try {
            HttpResponse response = httpClient.execute(httpPost);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("Method failed:" + response.getStatusLine());
            }else{
                String result = EntityUtils.toString(response.getEntity());

                return result;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
