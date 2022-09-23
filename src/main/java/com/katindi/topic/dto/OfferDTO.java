package com.katindi.topic.dto;


import java.io.Serializable;
import java.util.List;

public class OfferDTO implements Serializable {
    private String id;
    private String title;
    private List<TechSkillsDTO>  techSkillsTDO;
    private List<DegreDTO> degreesTDO;
    private LevelProfil profilLevelTDO;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<TechSkillsDTO> getTechSkillsTDO() {
        return techSkillsTDO;
    }

    public void setTechSkillsTDO(List<TechSkillsDTO> techSkillsTDO) {
        this.techSkillsTDO = techSkillsTDO;
    }

    public List<DegreDTO> getDegreesTDO() {
        return degreesTDO;
    }

    public void setDegreesTDO(List<DegreDTO> degreesTDO) {
        this.degreesTDO = degreesTDO;
    }

    public LevelProfil getProfilLevelTDO() {
        return profilLevelTDO;
    }

    public void setProfilLevelTDO(LevelProfil profilLevelTDO) {
        this.profilLevelTDO = profilLevelTDO;
    }

    @Override
    public String toString() {
        return "OfferDTO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", techSkillsTDO=" + techSkillsTDO+
                ", degreesTDO=" + degreesTDO +
                ", profilLevelTDO=" + profilLevelTDO +
                '}';
    }
}
