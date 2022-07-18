package com.salt.cms.user.controller;

import com.salt.cms.comm.R;
import com.salt.cms.team.form.SaltTeamForm;
import com.salt.cms.team.service.SaltTeamService;
import com.salt.cms.user.form.SaltUserForm;
import com.salt.cms.user.service.SaltUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/SaltTeam")
public class SaltUserController {
    @Autowired
    private SaltUserService saltUserService;

    @PostMapping("/verifyUser")
    public R verifyUser(@RequestBody SaltUserForm user){
        return saltUserService.verifyUser(user);
    }

    @PostMapping("/modifyPsw")
    public R modifyPsw(@RequestBody SaltUserForm user){
        return saltUserService.modifyPsw(user);
    }
}
