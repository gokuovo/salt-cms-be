package com.salt.cms.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.salt.cms.entity.SaltPartnerEntity;
import com.salt.cms.entity.SaltUserEntity;
import com.salt.cms.partners.form.SaltPartnersForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SaltUserDao extends BaseMapper<SaltUserEntity> {

}
