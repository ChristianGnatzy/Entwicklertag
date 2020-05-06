package de.entwicklertag.graphqldemo.model;

import java.util.List;

public class Participant {
    private int id;
    private String firstName;
    private String surName;
    private List<Skill> skills;

    public Participant(int id, String firstName, String surName, List<Skill> skills) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
