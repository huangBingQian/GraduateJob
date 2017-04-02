package TeamB.GraduateJob.dao.mapper;

import TeamB.GraduateJob.po.inform;
import TeamB.GraduateJob.po.informExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface informMapper {
    int countByExample(informExample example);

    int deleteByExample(informExample example);

    int deleteByPrimaryKey(Integer informid);

    int insert(inform record);

    int insertSelective(inform record);

    List<inform> selectByExample(informExample example);

    inform selectByPrimaryKey(Integer informid);

    int updateByExampleSelective(@Param("record") inform record, @Param("example") informExample example);

    int updateByExample(@Param("record") inform record, @Param("example") informExample example);

    int updateByPrimaryKeySelective(inform record);

    int updateByPrimaryKey(inform record);
}