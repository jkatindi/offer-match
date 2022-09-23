package com.katindi.topic.dto;

import java.io.Serializable;

public class LevelProfil  implements Serializable {
   private  String level;
   private int experience;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "LevelProfil{" +
                "level='" + level + '\'' +
                ", experience=" + experience +
                '}';
    }
}
