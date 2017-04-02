package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Graduate;
import teamB.GraduateJob.po.GraduateExample;

import java.util.List;

public interface GraduateMapper {
    int countByExample(GraduateExample example);

    int deleteByExample(GraduateExample example);

    int deleteByPrimaryKey(Integer graduateid);

    int insert(Graduate record);

    int insertSelective(Graduate record);

    List<Graduate> selectByExample(GraduateExample example);

    Graduate selectByPrimaryKey(Integer graduateid);

    int updateByExampleSelective(@Param("record") Graduate record, @Param("example") GraduateExample example);

    int updateByExample(@Param("record") Graduate record, @Param("example") GraduateExample example);

    int updateByPrimaryKeySelective(Graduate record);

    int updateByPrimaryKey(Graduate record);
}