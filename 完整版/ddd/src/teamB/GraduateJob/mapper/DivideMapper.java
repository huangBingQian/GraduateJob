package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Divide;
import teamB.GraduateJob.po.DivideExample;

import java.util.List;

public interface DivideMapper {
    int countByExample(DivideExample example);

    int deleteByExample(DivideExample example);

    int deleteByPrimaryKey(Integer jobid);

    int insert(Divide record);

    int insertSelective(Divide record);

    List<Divide> selectByExample(DivideExample example);

    Divide selectByPrimaryKey(Integer jobid);

    int updateByExampleSelective(@Param("record") Divide record, @Param("example") DivideExample example);

    int updateByExample(@Param("record") Divide record, @Param("example") DivideExample example);

    int updateByPrimaryKeySelective(Divide record);

    int updateByPrimaryKey(Divide record);
}