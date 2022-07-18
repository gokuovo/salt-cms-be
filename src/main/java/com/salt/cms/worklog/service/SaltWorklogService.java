package com.salt.cms.worklog.service;

import com.salt.cms.comm.R;
import com.salt.cms.worklog.form.SaltWorklogForm;

import java.util.List;

public interface SaltWorklogService {
    List<SaltWorklogForm> getNews();
    R addNews(SaltWorklogForm saltNewsForm);
    R deleteNews(String id);
    R modifyNews(SaltWorklogForm saltNewsForm);
}
