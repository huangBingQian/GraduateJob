package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Talkjob;
import teamB.GraduateJob.po.TalkjobExample;

import java.util.List;

public interface TalkjobMapper {
    int countByExample(TalkjobExample example);

    int deleteByExample(TalkjobExample example);

    int insert(Talkjob record);

    int insertSelective(Talkjob record);

    List<Talkjob> selectByExample(TalkjobExample example);

    int updateByExampleSelective(@Param("record") Talkjob record, @Param("example") TalkjobExample example);

    int updateByExample(@Param("record") Talkjob record, @Param("example") TalkjobExample example);
}