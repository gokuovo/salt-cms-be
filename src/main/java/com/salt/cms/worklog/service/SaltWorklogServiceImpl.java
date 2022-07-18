package com.salt.cms.worklog.service;

import com.salt.cms.comm.R;
import com.salt.cms.entity.SaltWorklogEntity;
import com.salt.cms.worklog.dao.SaltWorklogDao;
import com.salt.cms.worklog.form.SaltWorklogForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class SaltWorklogServiceImpl implements SaltWorklogService {
    @Autowired
    private SaltWorklogDao saltWorklogDao;


    @Override
    public List<SaltWorklogForm> getNews() {
        return saltWorklogDao.getNews();
    }

    @Override
    public R addNews(SaltWorklogForm saltWorklogForm) {
        SaltWorklogEntity saltWorklogEntity = new SaltWorklogEntity();
        BeanUtils.copyProperties(saltWorklogForm,saltWorklogEntity);
        saltWorklogEntity.setId(UUID.randomUUID().toString());
        saltWorklogDao.insert(saltWorklogEntity);
        return R.ok("添加成功");
    }

    @Override
    public R deleteNews(String id) {
        saltWorklogDao.deleteById(id);
        return null;
    }

    @Override
    public R modifyNews(SaltWorklogForm saltWorklogForm) {
        SaltWorklogEntity saltWorklogEntity = new SaltWorklogEntity();
        BeanUtils.copyProperties(saltWorklogForm,saltWorklogEntity);
        saltWorklogDao.updateById(saltWorklogEntity);
        return R.ok("修改成功");
    }

}
