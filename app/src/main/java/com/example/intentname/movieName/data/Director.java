package com.example.intentname.movieName.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Director {

    @SerializedName("peopleNm")
    @Expose
    private String peopleNm;

    public String getPeopleNm() {
        return peopleNm;
    }

    public void setPeopleNm(String peopleNm) {
        this.peopleNm = peopleNm;
    }
}