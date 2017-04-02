package TeamB.GraduateJob.controller;

import TeamB.GraduateJob.dao.mapper.homepageJoblistMapper;
import TeamB.GraduateJob.po.homepageJoblist;
import TeamB.GraduateJob.po.homepageJoblistExample;
import TeamB.GraduateJob.po.joblist;
import TeamB.GraduateJob.service.impl.JoblistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import TeamB.GraduateJob.po.joblistExample;
import TeamB.GraduateJob.dao.mapper.joblistMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Josep on 2016/8/2 0002.
 */
@Controller
public class TestController {

    @Autowired
    private JoblistService joblistService;
    @Autowired
    private homepageJoblistMapper hpJoblistMapper;

    @RequestMapping("/test1")
    public String test1(){
        homepageJoblistExample example = new homepageJoblistExample();
        homepageJoblistExample.Criteria criteria = example.createCriteria();
        criteria.getAllCriteria();
        List<homepageJoblist> homepageJobs = hpJoblistMapper.selectByExample(example);
        System.out.println("---"+homepageJobs);
        return "stu_home";
    }
    @RequestMapping("/test2")
    public String test2(HttpServletRequest request){
        List<joblist> joblists = null;
        joblists = joblistService.selectByType(request);

        joblistService.Paging(request, joblists);
        return "stu_job";
    }
    @RequestMapping("/test3")
    public String test3(HttpServletRequest request){
        homepageJoblistExample example = new homepageJoblistExample();
        homepageJoblistExample.Criteria criteria = example.createCriteria();
        criteria.getAllCriteria();
        List<homepageJoblist> homepageJobs = hpJoblistMapper.selectByExample(example);
        Map<String, List<homepageJoblist>> joblistMap = new HashMap<>();
        String type = "";
        for(homepageJoblist item: homepageJobs){
            type = item.getType();
            if(joblistMap.get(type) == null){
                List<homepageJoblist> l = new ArrayList<>();
                l.add(item);
                joblistMap.put(type, l);
            }else {
                if(joblistMap.get(type).size() < 6)
                    joblistMap.get(type).add(item);
            }
        }
        System.out.println(joblistMap);

        request.getSession().setAttribute("IT", joblistMap.get("IT"));
        return "stu_home";
    }
    @RequestMapping("/test4")
    public String test4(HttpServletRequest request){
        if(request.getParameter("type") != null){
            Map<String,String[]> m = request.getParameterMap();

            return "stu_home";
        }
        System.out.println("run");
        return "company_baseInfo";

    }
    @RequestMapping("/test5")
    public String test5(HttpServletRequest request){
        Map<String,String[]> m = request.getParameterMap();

            return "company_infoarr";

    }
    @RequestMapping("/test6")
    public String test6(HttpServletRequest request){
        Map<String,String[]> m = request.getParameterMap();

        return "company_infomsg";

    }

}

