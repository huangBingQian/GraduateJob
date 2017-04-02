package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Companycharacterlist;
import teamB.GraduateJob.po.CompanycharacterlistExample;

import java.util.List;

public interface CompanycharacterlistMapper {
    int countByExample(CompanycharacterlistExample example);

    int deleteByExample(CompanycharacterlistExample example);

    int deleteByPrimaryKey(Integer companycharacterid);

    int insert(Companycharacterlist record);

    int insertSelective(Companycharacterlist record);

    List<Companycharacterlist> selectByExample(CompanycharacterlistExample example);

    Companycharacterlist selectByPrimaryKey(Integer companycharacterid);

    int updateByExampleSelective(@Param("record") Companycharacterlist record, @Param("example") CompanycharacterlistExample example);

    int updateByExample(@Param("record") Companycharacterlist record, @Param("example") CompanycharacterlistExample example);

    int updateByPrimaryKeySelective(Companycharacterlist record);

    int updateByPrimaryKey(Companycharacterlist record);
}