package com.salt.cms.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.salt.cms.comm.R;
import com.salt.cms.entity.SaltUserEntity;
import com.salt.cms.team.service.SaltTeamService;
import com.salt.cms.user.dao.SaltUserDao;
import com.salt.cms.user.form.SaltUserForm;
import com.salt.cms.user.service.SaltUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;


@Slf4j
@Service
public class SaltUserServiceImpl implements SaltUserService {

    @Autowired
    private SaltUserDao saltUserDao;

    @Override
    public R verifyUser(SaltUserForm user) {
        QueryWrapper<SaltUserEntity> qw = new QueryWrapper<>();
        qw.eq("user",user.getUser());
        SaltUserEntity saltUserEntity =new SaltUserEntity();
        saltUserEntity = saltUserDao.selectOne(qw);
        if (ObjectUtils.isEmpty(saltUserEntity)){
            return R.error("该用户不存在");
        }
        if (user.getPassword().equals(saltUserEntity.getPassword())){
            return R.ok("登录成功");
        }else{
            return R.error("密码错误");
        }

    }

    @Override
    public R modifyPsw(SaltUserForm user) {
        QueryWrapper<SaltUserEntity> qw = new QueryWrapper<>();
        qw.eq("user",user.getUser());
        SaltUserEntity saltUserEntity =new SaltUserEntity();
        saltUserEntity = saltUserDao.selectOne(qw);
        if (ObjectUtils.isEmpty(saltUserEntity)){
            return R.error("该用户不存在");
        }
        saltUserEntity.setPassword(user.getPassword());
        if (user.getPassword().length()<6){
            return  R.error("密码不能少于6位");
        }
        saltUserDao.updateById(saltUserEntity);
        return R.ok();
    }
}
