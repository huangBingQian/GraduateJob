package TeamB.GraduateJob.dao.mapper;

import TeamB.GraduateJob.po.jian_li;
import TeamB.GraduateJob.po.jian_liExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface jian_liMapper {
    int countByExample(jian_liExample example);

    int deleteByExample(jian_liExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(jian_li record);

    int insertSelective(jian_li record);

    List<jian_li> selectByExampleWithBLOBs(jian_liExample example);

    List<jian_li> selectByExample(jian_liExample example);

    jian_li selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") jian_li record, @Param("example") jian_liExample example);

    int updateByExampleWithBLOBs(@Param("record") jian_li record, @Param("example") jian_liExample example);

    int updateByExample(@Param("record") jian_li record, @Param("example") jian_liExample example);

    int updateByPrimaryKeySelective(jian_li record);

    int updateByPrimaryKeyWithBLOBs(jian_li record);

    int updateByPrimaryKey(jian_li record);
}