package com.salt.cms.worklog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.salt.cms.entity.SaltNewsEntity;
import com.salt.cms.entity.SaltWorklogEntity;
import com.salt.cms.worklog.form.SaltWorklogForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SaltWorklogDao extends BaseMapper<SaltWorklogEntity> {

    @Select("select * from salt_news order by sort")
    List<SaltWorklogForm> getNews();


}
