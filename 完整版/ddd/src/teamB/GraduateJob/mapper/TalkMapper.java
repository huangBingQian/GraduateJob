package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Talk;
import teamB.GraduateJob.po.TalkExample;

import java.util.List;

public interface TalkMapper {
    int countByExample(TalkExample example);

    int deleteByExample(TalkExample example);

    int deleteByPrimaryKey(Integer talkid);

    int insert(Talk record);

    int insertSelective(Talk record);

    List<Talk> selectByExample(TalkExample example);

    Talk selectByPrimaryKey(Integer talkid);

    int updateByExampleSelective(@Param("record") Talk record, @Param("example") TalkExample example);

    int updateByExample(@Param("record") Talk record, @Param("example") TalkExample example);

    int updateByPrimaryKeySelective(Talk record);

    int updateByPrimaryKey(Talk record);
}