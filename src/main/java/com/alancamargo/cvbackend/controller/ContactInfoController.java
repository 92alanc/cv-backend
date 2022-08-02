package com.alancamargo.cvbackend.controller;

import com.alancamargo.cvbackend.model.ContactInfo;
import com.alancamargo.cvbackend.service.ContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class ContactInfoController {

    @Autowired
    private ContactInfoService contactInfoService;

    @GetMapping("/contact-info")
    public ContactInfo getContactInfo() {
        return contactInfoService.getContactInfo();
    }

    @PostMapping("/contact-info")
    public void updateContactInfo(@RequestBody ContactInfo contactInfo) {
        contactInfoService.updateContactInfo(contactInfo);
    }

}
