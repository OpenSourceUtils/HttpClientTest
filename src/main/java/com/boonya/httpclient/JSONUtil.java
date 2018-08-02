package com.boonya.httpclient;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

/**
 * @ClassName: JSONUtil
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-07-21
 */
public class JSONUtil {

    /**
     * 对象转json
     * @param obj object 对象
     * @return String
     * @throws IOException
     */
    public static String toJson(Object obj) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createJsonGenerator(sw);
        mapper.writeValue(gen, obj);
        gen.close();
        return sw.toString();
    }

    /**
     * json转对象
     * @param jsonStr json字符串
     * @param objClass 类名.class
     * @return 泛型
     * @throws Exception
     */
    public static <T> T toObject(String jsonStr, Class<T> objClass)
            throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(jsonStr, objClass);
    }
}
