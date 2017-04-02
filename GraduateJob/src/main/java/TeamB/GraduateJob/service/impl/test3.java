package TeamB.GraduateJob.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by 黄炳乾 on 2017/1/10.
 */
public class test3 {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        stringList.add("aa");
        stringList.add("ab");
        stringList.add("aa");
        Set<String> stringSet = new HashSet<>(stringList);
        System.out.println(stringSet);
    }
}
