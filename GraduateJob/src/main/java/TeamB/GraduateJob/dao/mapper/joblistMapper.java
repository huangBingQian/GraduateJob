package TeamB.GraduateJob.dao.mapper;

import TeamB.GraduateJob.po.joblist;
import TeamB.GraduateJob.po.joblistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface joblistMapper {
    int countByExample(joblistExample example);

    int deleteByExample(joblistExample example);

    int deleteByPrimaryKey(String jobid);

    int insert(joblist record);

    int insertSelective(joblist record);

    List<joblist> selectByExample(joblistExample example);

    joblist selectByPrimaryKey(String jobid);

    int updateByExampleSelective(@Param("record") joblist record, @Param("example") joblistExample example);

    int updateByExample(@Param("record") joblist record, @Param("example") joblistExample example);

    int updateByPrimaryKeySelective(joblist record);

    int updateByPrimaryKey(joblist record);
}