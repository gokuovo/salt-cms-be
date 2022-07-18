package com.salt.cms.ourservice.controller;

import com.salt.cms.comm.R;
import com.salt.cms.menu.form.SPMenuForm;
import com.salt.cms.menu.service.SaltPortalMenuService;
import com.salt.cms.ourservice.service.SaltOurServiceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/SaltPortalMenu")
public class SaltOurServiceController {
//    @Autowired
//    private SaltOurServiceService ourService;

//    @GetMapping("/getMusic")
//    public SPMenuForm getMusic(){
//        log.info("开始获取Music视频");
//        return ourService.getMusic();
//    }
//
//    @GetMapping("/getSoundDesign")
//    public SPMenuForm getSoundDesign(){
//        log.info("开始获取SoundDesign视频");
//        return ourService.getSoundDesign();
//    }
//
//    @GetMapping("/getVoiceActing")
//    public SPMenuForm getVoiceActing(){
//        log.info("开始获取VoiceActing视频");
//        return ourService.getVoiceActing();
//    }
//
//    @GetMapping("/getGameAudioPipeline")
//    public SPMenuForm getGameAudioPipeline(){
//        log.info("开始获取GameAudioPipeline视频");
//        return ourService.getGameAudioPipeline();
//    }
//
//    @GetMapping("/getWhatWeDo")
//    public SPMenuForm getWhatWeDo(){
//        log.info("开始获取WhatWeDo视频");
//        return ourService.getWhatWeDo();
//    }
//
//    @GetMapping("/getWhatWeDoText")
//    public SPMenuForm getWhatWeDoText(){
//        log.info("开始获取WhatWeDoText视频");
//        return ourService.WhatWeDoText();
//    }
//
//    @GetMapping("/getRotation")
//    public SPMenuForm getRotation(){
//        log.info("开始获取Rotation视频");
//        return ourService.getRotation();
//    }
//
//    @PostMapping("/addMenu")
//    public R addMenu(@RequestBody SPMenuForm spMenuForm){
//        return saltPortalMenuService.addMenu(spMenuForm);
//    }
//
//    @PostMapping("modifyMenu")
//    public R modifyMenu(@RequestBody SPMenuForm spMenuForm){
//        return saltPortalMenuService.modifyMenu(spMenuForm);
//    }
//
//    @PostMapping("deleteMenu")
//    public R deleteMenu(@RequestBody String id){
//        return saltPortalMenuService.deleteMenu(id);
//    }
}
