package com.salt.cms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("salt_list")
@Data
@EqualsAndHashCode(callSuper = false)
public class SaltListEntity {
    private String id;
    private String titleEn;
    private String titleChi;
    private String titleJap;
    private String titleSpa;
    private String dateEn;
    private String dateChi;
    private String dateJap;
    private String dateSpa;
    private String companyEn;
    private String companyChi;
    private String companyJap;
    private String companyrSpa;
    private String platformEn;
    private String platformChi;
    private String platformJap;
    private String platformSpa;
    private String url;
    private String link;
}
