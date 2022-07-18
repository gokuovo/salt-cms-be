package com.salt.cms.user.service;


import com.salt.cms.comm.R;
import com.salt.cms.user.form.SaltUserForm;

public interface SaltUserService {
    R verifyUser(SaltUserForm user);
    R modifyPsw(SaltUserForm user);
}
