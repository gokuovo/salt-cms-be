package com.salt.cms.contactus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.salt.cms.contactus.form.SaltContactForm;
import com.salt.cms.entity.SaltContactEntity;
import com.salt.cms.entity.SaltPartnerEntity;
import com.salt.cms.partners.form.SaltPartnersForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SaltContactUsDao extends BaseMapper<SaltContactEntity> {


    @Select("select * from salt_contact order")
    SaltContactForm getContact();

}
