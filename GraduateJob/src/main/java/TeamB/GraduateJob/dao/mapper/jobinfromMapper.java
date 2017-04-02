package TeamB.GraduateJob.dao.mapper;

import TeamB.GraduateJob.po.jobinfrom;
import TeamB.GraduateJob.po.jobinfromExample;
import TeamB.GraduateJob.po.jobinfromWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface jobinfromMapper {
    int countByExample(jobinfromExample example);

    int deleteByExample(jobinfromExample example);

    int deleteByPrimaryKey(String jobid);

    int insert(jobinfromWithBLOBs record);

    int insertSelective(jobinfromWithBLOBs record);

    List<jobinfromWithBLOBs> selectByExampleWithBLOBs(jobinfromExample example);

    List<jobinfrom> selectByExample(jobinfromExample example);

    jobinfromWithBLOBs selectByPrimaryKey(String jobid);

    int updateByExampleSelective(@Param("record") jobinfromWithBLOBs record, @Param("example") jobinfromExample example);

    int updateByExampleWithBLOBs(@Param("record") jobinfromWithBLOBs record, @Param("example") jobinfromExample example);

    int updateByExample(@Param("record") jobinfrom record, @Param("example") jobinfromExample example);

    int updateByPrimaryKeySelective(jobinfromWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(jobinfromWithBLOBs record);

    int updateByPrimaryKey(jobinfrom record);
}