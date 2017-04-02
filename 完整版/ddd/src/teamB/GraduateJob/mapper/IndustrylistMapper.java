package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Industrylist;
import teamB.GraduateJob.po.IndustrylistExample;

import java.util.List;

public interface IndustrylistMapper {
    int countByExample(IndustrylistExample example);

    int deleteByExample(IndustrylistExample example);

    int deleteByPrimaryKey(Integer industryid);

    int insert(Industrylist record);

    int insertSelective(Industrylist record);

    List<Industrylist> selectByExample(IndustrylistExample example);

    Industrylist selectByPrimaryKey(Integer industryid);

    int updateByExampleSelective(@Param("record") Industrylist record, @Param("example") IndustrylistExample example);

    int updateByExample(@Param("record") Industrylist record, @Param("example") IndustrylistExample example);

    int updateByPrimaryKeySelective(Industrylist record);

    int updateByPrimaryKey(Industrylist record);
}