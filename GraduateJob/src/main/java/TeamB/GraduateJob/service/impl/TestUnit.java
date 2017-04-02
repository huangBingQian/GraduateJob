package TeamB.GraduateJob.service.impl;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 黄炳乾 on 2016/11/2.
 */
public class TestUnit {
    @Test
    public void test1(){
        Map<String, StringBuffer> testMap = new HashMap<>();
        testMap.put("a", new StringBuffer("a"));
        testMap.get("a").append("?");
        System.out.println(testMap);
    }
}
