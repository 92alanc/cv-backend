package com.alancamargo.cvbackend.model;

@SuppressWarnings("unused")
public class Period {

    private int startMonth;
    private int startYear;
    private Integer endMonth;
    private Integer endYear;

    public Period() { }

    public Period(
            int startMonth,
            int startYear,
            Integer endMonth,
            Integer endYear
    ) {
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public int getStartYear() {
        return startYear;
    }

    public Integer getEndMonth() {
        return endMonth;
    }

    public Integer getEndYear() {
        return endYear;
    }

}
