package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Inform;
import teamB.GraduateJob.po.InformExample;

import java.util.List;

public interface InformMapper {
    int countByExample(InformExample example);

    int deleteByExample(InformExample example);

    int deleteByPrimaryKey(Integer contactid);

    int insert(Inform record);

    int insertSelective(Inform record);

    List<Inform> selectByExample(InformExample example);

    Inform selectByPrimaryKey(Integer contactid);

    int updateByExampleSelective(@Param("record") Inform record, @Param("example") InformExample example);

    int updateByExample(@Param("record") Inform record, @Param("example") InformExample example);

    int updateByPrimaryKeySelective(Inform record);

    int updateByPrimaryKey(Inform record);
}