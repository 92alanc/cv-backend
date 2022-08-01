package com.alancamargo.cvbackend.controller;

import com.alancamargo.cvbackend.model.ContactInfo;
import com.alancamargo.cvbackend.service.ContactInfoService;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unused")
//@RestController
public class ContactInfoController {

    @Autowired
    private ContactInfoService contactInfoService;

    //@GetMapping("/contact-info")
    public ContactInfo getContactInfo() {
        return contactInfoService.getContactInfo();
    }

    //@PostMapping("/contact-info")
    public void updateContactInfo(/*@RequestBody*/ ContactInfo contactInfo) {
        contactInfoService.updateContactInfo(contactInfo);
    }

}
