package com.alancamargo.cvbackend.service;

import com.alancamargo.cvbackend.model.ContactInfo;

import java.util.ArrayList;
import java.util.List;

public class ContactInfoServiceImpl implements ContactInfoService {

    @Override
    public ContactInfo getContactInfo() {
        // TODO: read from database
        List<String> links = new ArrayList<>();
        links.add("https://www.github.com/alancamargo92");
        links.add("https://www.linkedin.com/in/92alanc");

        return new ContactInfo(
                "Alan Camargo",
                "07394 849457",
                "92alanc@protonmail.com",
                links
        );
    }

    @Override
    public void updateContactInfo(ContactInfo contactInfo) {
        // TODO: update database
    }

}
