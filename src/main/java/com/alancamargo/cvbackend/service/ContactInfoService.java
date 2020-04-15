package com.alancamargo.cvbackend.service;

import com.alancamargo.cvbackend.model.ContactInfo;

public interface ContactInfoService {

    ContactInfo getContactInfo();

    void updateContactInfo(ContactInfo contactInfo);

}
