package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Jobs;
import teamB.GraduateJob.po.JobsExample;

import java.util.List;

public interface JobsMapper {
    int countByExample(JobsExample example);

    int deleteByExample(JobsExample example);

    int deleteByPrimaryKey(Integer jobid);

    int insert(Jobs record);

    int insertSelective(Jobs record);

    List<Jobs> selectByExample(JobsExample example);

    Jobs selectByPrimaryKey(Integer jobid);

    int updateByExampleSelective(@Param("record") Jobs record, @Param("example") JobsExample example);

    int updateByExample(@Param("record") Jobs record, @Param("example") JobsExample example);

    int updateByPrimaryKeySelective(Jobs record);

    int updateByPrimaryKey(Jobs record);
}