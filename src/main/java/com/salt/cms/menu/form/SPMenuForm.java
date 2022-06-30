package com.salt.cms.menu.form;

import lombok.Data;

@Data
public class SPMenuForm {
    private String id;
    private String menuNameEn;
    private String menuNameJap;
    private String menuNameSpa;
    private String url;
    private int sort;
}
