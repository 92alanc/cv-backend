package com.alancamargo.cvbackend.controller;

import com.alancamargo.cvbackend.model.Headline;
import com.alancamargo.cvbackend.service.HeadlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class HeadlineController {

    @Autowired
    private HeadlineService headlineService;

    @GetMapping("/headline")
    public Headline getHeadline() {
        return headlineService.getHeadline();
    }

}
