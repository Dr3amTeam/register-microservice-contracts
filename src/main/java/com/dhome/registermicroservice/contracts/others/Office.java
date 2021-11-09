package com.dhome.registermicroservice.contracts.others;

import javax.persistence.Embeddable;

@Embeddable
public class Office {
    private String name;
    private String speciality;

    public Office() {
        super();
    }

    public Office(String name, String speciality) {
        super();
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}
