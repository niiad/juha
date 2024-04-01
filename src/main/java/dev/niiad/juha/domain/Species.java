package dev.niiad.juha.domain;

import jakarta.persistence.*;

@Entity
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false, length = 155)
    private String name;

    @Column(name = "appearance", nullable = false, length = 512)
    private String appearance;

    @Column(name = "anatomy", nullable = false, length = 512)
    private String anatomy;

    @Column(name = "diet", nullable = false, length = 155)
    private String diet;

    @Column(name = "language", nullable = false, length = 155)
    private String language;

    @Column(name = "structure", nullable = false, length = 155)
    private String structure;

    @Column(name = "religion", nullable = false, length = 155)
    private String religion;

    @Column(name = "culture", nullable = false, length = 155)
    private String culture;

    @Column(name = "governance", nullable = false, length = 155)
    private String governance;

    @Column(name = "origin", nullable = false, length = 200)
    private String origin;

    @Column(name = "economy", nullable = false)
    private int economy;

    @Column(name = "intelligence", nullable = false)
    private int intelligence;

    @Column(name = "technology", nullable = false)
    private int technology;

    @Column(name = "education", nullable = false)
    private int education;

    @Column(name = "military", nullable = false)
    private int military;

    public Species() {}

    public Species(
            String name, String appearance, String anatomy, String diet, String language, String structure,
            String religion, String culture, String governance, String origin, int economy, int intelligence,
            int technology, int education, int military
    ) {
        this.name = name;
        this.appearance = appearance;
        this.anatomy = anatomy;
        this.diet = diet;
        this.language = language;
        this.structure = structure;
        this.religion = religion;
        this.culture = culture;
        this.governance = governance;
        this.origin = origin;
        this.economy = economy;
        this.intelligence = intelligence;
        this.technology = technology;
        this.education = education;
        this.military = military;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getAnatomy() {
        return anatomy;
    }

    public void setAnatomy(String anatomy) {
        this.anatomy = anatomy;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getGovernance() {
        return governance;
    }

    public void setGovernance(String governance) {
        this.governance = governance;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getEconomy() {
        return economy;
    }

    public void setEconomy(int economy) {
        this.economy = economy;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getTechnology() {
        return technology;
    }

    public void setTechnology(int technology) {
        this.technology = technology;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getMilitary() {
        return military;
    }

    public void setMilitary(int military) {
        this.military = military;
    }
}
