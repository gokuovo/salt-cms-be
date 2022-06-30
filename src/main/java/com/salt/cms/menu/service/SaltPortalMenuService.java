package com.salt.cms.menu.service;

import com.salt.cms.comm.R;
import com.salt.cms.menu.form.SPMenuForm;


public interface SaltPortalMenuService {

    SPMenuForm getMenu();
    R addMenu(SPMenuForm spMenuForm);
    R modifyMenu(SPMenuForm spMenuForm);
    R deleteMenu(String id);
}
