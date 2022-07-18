package com.salt.cms.news.form;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class SaltNewsForm {
    private String id;
    private String titleEn;
    private String titleChi;
    private String titleJap;
    private String titleSpa;
    private String dateEn;
    private String dateChi;
    private String dateJap;
    private String dateSpa;
    private String url;
    private String link;
}
