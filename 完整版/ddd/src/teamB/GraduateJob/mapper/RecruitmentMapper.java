package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Recruitment;
import teamB.GraduateJob.po.RecruitmentExample;

import java.util.List;

public interface RecruitmentMapper {
    int countByExample(RecruitmentExample example);

    int deleteByExample(RecruitmentExample example);

    int deleteByPrimaryKey(Integer recruitmentid);

    int insert(Recruitment record);

    int insertSelective(Recruitment record);

    List<Recruitment> selectByExample(RecruitmentExample example);

    Recruitment selectByPrimaryKey(Integer recruitmentid);

    int updateByExampleSelective(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByExample(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByPrimaryKeySelective(Recruitment record);

    int updateByPrimaryKey(Recruitment record);
}