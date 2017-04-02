package TeamB.GraduateJob.dao.mapper;

import TeamB.GraduateJob.po.dai_ban_shi_xiang;
import TeamB.GraduateJob.po.dai_ban_shi_xiangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface dai_ban_shi_xiangMapper {
    int countByExample(dai_ban_shi_xiangExample example);

    int deleteByExample(dai_ban_shi_xiangExample example);

    int deleteByPrimaryKey(Integer daibanshixiangid);

    int insert(dai_ban_shi_xiang record);

    int insertSelective(dai_ban_shi_xiang record);

    List<dai_ban_shi_xiang> selectByExample(dai_ban_shi_xiangExample example);

    dai_ban_shi_xiang selectByPrimaryKey(Integer daibanshixiangid);

    int updateByExampleSelective(@Param("record") dai_ban_shi_xiang record, @Param("example") dai_ban_shi_xiangExample example);

    int updateByExample(@Param("record") dai_ban_shi_xiang record, @Param("example") dai_ban_shi_xiangExample example);

    int updateByPrimaryKeySelective(dai_ban_shi_xiang record);

    int updateByPrimaryKey(dai_ban_shi_xiang record);
}