# HttpClientTest
HttpClientTest for java.

# Test method
<pre>
package com.boonya.httpclient;
import java.util.Date;

/**
 * @ClassName: MainTest
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-07-19
 */
public class MainTest {

    public static void main(String[] args) throws Exception{

        String url="http://127.0.0.1:18100/api/WebService/MultiSIMAlarmForJsonParam";
        FileSourceMultiRequest request=new FileSourceMultiRequest();
        request.setSims(new String[]{"",""});
        request.setChannel(1);
        request.setAlarms(new long[]{1});
        Date start=new Date();
        start.setTime(start.getTime()-86400);
        request.setStartTime(start);
        Date end=new Date();
        end.setTime(end.getTime()+86400);
        request.setEndTime(end);
        request.setStorageType(0);
        request.setStreamType(0);
        request.setDataType(0);

        System.out.println(HttpClientUtil.post(url,JSONUtil.toJson(request)));

    }
}

</pre>
