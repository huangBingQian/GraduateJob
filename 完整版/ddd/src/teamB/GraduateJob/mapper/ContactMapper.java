package teamB.GraduateJob.mapper;

import org.apache.ibatis.annotations.Param;
import teamB.GraduateJob.po.Contact;
import teamB.GraduateJob.po.ContactExample;

import java.util.List;

public interface ContactMapper {
    int countByExample(ContactExample example);

    int deleteByExample(ContactExample example);

    int insert(Contact record);

    int insertSelective(Contact record);

    List<Contact> selectByExample(ContactExample example);

    int updateByExampleSelective(@Param("record") Contact record, @Param("example") ContactExample example);

    int updateByExample(@Param("record") Contact record, @Param("example") ContactExample example);
}