package TeamB.GraduateJob.service.impl;

import TeamB.GraduateJob.dao.mapper.joblistMapper;
import TeamB.GraduateJob.po.joblist;
import TeamB.GraduateJob.po.joblistExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 黄炳乾 on 2016/10/31.
 */

@Service
public class JoblistService {
    @Autowired
    private joblistMapper joblistMapper;

    public void Paging(HttpServletRequest request, List<joblist> joblists){
        int pageNub= joblists.size() / 15;
        if(joblists.size()%15 >0){
            ++pageNub;
        }
        if(request.getParameter("page") == null){
            if(joblists.size() >= 15){
                joblists = joblists.subList(0, 15);
            }else {
                joblists = joblists.subList(0, joblists.size());
            }
            request.getSession().setAttribute("page", 1);

        }else{
            int page = Integer.valueOf(request.getParameter("page"));
            page--;
            if(joblists.size() - page*15 >= 15){
                joblists = joblists.subList(page*15, page*15+15);
            }else {
                joblists = joblists.subList(page*15, joblists.size());
            }
            request.getSession().setAttribute("page", ++page);


        }
        request.getSession().setAttribute("jobList", joblists);
        request.getSession().setAttribute("pageNub", pageNub);

    }

    public List<joblist> selectByType(HttpServletRequest request) {
        String type = request.getParameter("type");
        joblistExample itemsExample = new joblistExample();
        //通过criteria构造查询条件
        joblistExample.Criteria criteria = itemsExample.createCriteria();

        if(type == null){
            criteria.getAllCriteria();
        }else{
            criteria.andTypeEqualTo(type);
        }
        return joblistMapper.selectByExample(itemsExample);
    }
}
