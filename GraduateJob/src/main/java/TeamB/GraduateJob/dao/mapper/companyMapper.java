package TeamB.GraduateJob.dao.mapper;

import TeamB.GraduateJob.po.company;
import TeamB.GraduateJob.po.companyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface companyMapper {
    int countByExample(companyExample example);

    int deleteByExample(companyExample example);

    int deleteByPrimaryKey(String companyname);

    int insert(company record);

    int insertSelective(company record);

    List<company> selectByExampleWithBLOBs(companyExample example);

    List<company> selectByExample(companyExample example);

    company selectByPrimaryKey(String companyname);

    int updateByExampleSelective(@Param("record") company record, @Param("example") companyExample example);

    int updateByExampleWithBLOBs(@Param("record") company record, @Param("example") companyExample example);

    int updateByExample(@Param("record") company record, @Param("example") companyExample example);

    int updateByPrimaryKeySelective(company record);

    int updateByPrimaryKeyWithBLOBs(company record);

    int updateByPrimaryKey(company record);
}