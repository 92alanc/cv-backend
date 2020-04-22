package com.alancamargo.cvbackend.model;

public class Period {

    private String startMonth;
    private String startYear;
    private String endMonth;
    private String endYear;

    public Period() { }

    public Period(
            String startMonth,
            String startYear,
            String endMonth,
            String endYear
    ) {
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public String getStartYear() {
        return startYear;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public String getEndYear() {
        return endYear;
    }

}
