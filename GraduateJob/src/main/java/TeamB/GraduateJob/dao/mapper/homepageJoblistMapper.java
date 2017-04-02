package TeamB.GraduateJob.dao.mapper;

import TeamB.GraduateJob.po.homepageJoblist;
import TeamB.GraduateJob.po.homepageJoblistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface homepageJoblistMapper {
    int countByExample(homepageJoblistExample example);

    int deleteByExample(homepageJoblistExample example);

    int insert(homepageJoblist record);

    int insertSelective(homepageJoblist record);

    List<homepageJoblist> selectByExample(homepageJoblistExample example);

    int updateByExampleSelective(@Param("record") homepageJoblist record, @Param("example") homepageJoblistExample example);

    int updateByExample(@Param("record") homepageJoblist record, @Param("example") homepageJoblistExample example);
}