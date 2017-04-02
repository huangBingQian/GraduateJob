package TeamB.GraduateJob.dao.mapper;

import TeamB.GraduateJob.po.myresume;
import TeamB.GraduateJob.po.myresumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface myresumeMapper {
    int countByExample(myresumeExample example);

    int deleteByExample(myresumeExample example);

    int insert(myresume record);

    int insertSelective(myresume record);

    List<myresume> selectByExample(myresumeExample example);

    int updateByExampleSelective(@Param("record") myresume record, @Param("example") myresumeExample example);

    int updateByExample(@Param("record") myresume record, @Param("example") myresumeExample example);
}