package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Jointalk;
import teamB.GraduateJob.po.JointalkExample;

import java.util.List;

public interface JointalkMapper {
    int countByExample(JointalkExample example);

    int deleteByExample(JointalkExample example);

    int insert(Jointalk record);

    int insertSelective(Jointalk record);

    List<Jointalk> selectByExample(JointalkExample example);

    int updateByExampleSelective(@Param("record") Jointalk record, @Param("example") JointalkExample example);

    int updateByExample(@Param("record") Jointalk record, @Param("example") JointalkExample example);
}