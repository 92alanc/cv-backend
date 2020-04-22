package com.alancamargo.cvbackend.service;

import com.alancamargo.cvbackend.model.Headline;

public class HeadlineServiceImpl implements HeadlineService {

    @Override
    public Headline getHeadline() {
        return new Headline("I am a man who walks alone, but when I'm walking a dark road alone or strolling " +
                "through the park, and when the light begins to fade I sometimes feel a little strange, " +
                "a little anxious when it's dark.");
    }

}
