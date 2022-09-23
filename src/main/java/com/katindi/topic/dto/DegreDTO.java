package com.katindi.topic.dto;

import java.io.Serializable;

public class DegreDTO implements Serializable {
   private  String degreeName;

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    @Override
    public String toString() {
        return "DegreDTO{" +
                "degreeName='" + degreeName + '\'' +
                '}';
    }
}
