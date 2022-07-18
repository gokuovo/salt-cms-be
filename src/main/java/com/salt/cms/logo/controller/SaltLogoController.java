package com.salt.cms.logo.controller;

import com.salt.cms.logo.service.SaltLogoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/Saltlogo")
public class SaltLogoController {
    @Autowired
    private SaltLogoService saltLogoService;

    @GetMapping("/getLogo")
    public String getMenu(){
        log.info("开始获取门户工作室图标");
        return saltLogoService.getLogo();
    }
//
//    @PostMapping("modifyLogo")
//    public R modifyMenu(@RequestBody SPMenuForm spMenuForm){
//        return saltLogoService.modifyLogo(spMenuForm);
//    }
//
//    @PostMapping("deleteLogo")
//    public R deleteMenu(@RequestBody String id){
//        return saltLogoService.deleteLogo(id);
//    }
}
