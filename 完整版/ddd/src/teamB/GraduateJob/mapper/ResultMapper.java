package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Result;
import teamB.GraduateJob.po.ResultExample;

import java.util.List;

public interface ResultMapper {
    int countByExample(ResultExample example);

    int deleteByExample(ResultExample example);

    int insert(Result record);

    int insertSelective(Result record);

    List<Result> selectByExample(ResultExample example);

    int updateByExampleSelective(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByExample(@Param("record") Result record, @Param("example") ResultExample example);
}