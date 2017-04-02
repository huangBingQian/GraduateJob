package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.HandInResume;
import teamB.GraduateJob.po.HandInResumeExample;

import java.util.List;

public interface HandInResumeMapper {
    int countByExample(HandInResumeExample example);

    int deleteByExample(HandInResumeExample example);

    int insert(HandInResume record);

    int insertSelective(HandInResume record);

    List<HandInResume> selectByExample(HandInResumeExample example);

    int updateByExampleSelective(@Param("record") HandInResume record, @Param("example") HandInResumeExample example);

    int updateByExample(@Param("record") HandInResume record, @Param("example") HandInResumeExample example);
}