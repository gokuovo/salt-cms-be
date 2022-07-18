package com.salt.cms.news.service;

import com.salt.cms.comm.R;
import com.salt.cms.news.form.SaltNewsForm;

import java.util.List;

public interface SaltNewsService {
    List<SaltNewsForm> getNews();
    R addNews(SaltNewsForm saltNewsForm);
    R deleteNews(String id);
    R modifyNews(SaltNewsForm saltNewsForm);
}
