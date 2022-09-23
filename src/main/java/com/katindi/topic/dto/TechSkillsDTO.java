package com.katindi.topic.dto;

import java.io.Serializable;

public class TechSkillsDTO  implements Serializable {
    private String technology;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "TechSkillsDTO{" +
                "technology='" + technology + '\'' +
                '}';
    }
}
