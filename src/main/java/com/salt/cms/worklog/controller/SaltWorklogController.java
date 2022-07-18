package com.salt.cms.worklog.controller;

import com.salt.cms.comm.R;
import com.salt.cms.worklog.form.SaltWorklogForm;
import com.salt.cms.worklog.service.SaltWorklogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/SaltWorklog")
public class SaltWorklogController {
    @Autowired
    private SaltWorklogService saltWorklogService;

    @GetMapping("/getWorklog")
    public List<SaltWorklogForm> getNews(){
        log.info("开始news信息");
        return saltWorklogService.getNews();
    }

    @PostMapping("/addWorklog")
    public R addNews(@RequestBody SaltWorklogForm saltNewsForm){
        return saltWorklogService.addNews(saltNewsForm);
    }

    @PostMapping("modifyWorklog")
    public R modifyNews(@RequestBody SaltWorklogForm saltNewsForm){
        return saltWorklogService.modifyNews(saltNewsForm);
    }

    @PostMapping("deleteWorklog")
    public R deleteNews(@RequestBody String id){
        return saltWorklogService.deleteNews(id);
    }
}
