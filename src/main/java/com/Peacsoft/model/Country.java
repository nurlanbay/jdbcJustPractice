package com.Peacsoft.model;

public class Country {
    private int id;
    private String name;
    private int population;
    private int budget;
    private int how_many_university;
    private int person_id;

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country(int id, String name, int population, int budget, int how_many_university, int person_id) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.budget = budget;
        this.how_many_university = how_many_university;
        this.person_id = person_id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getHow_many_university() {
        return how_many_university;
    }

    public void setHow_many_university(int how_many_university) {
        this.how_many_university = how_many_university;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", budget=" + budget +
                ", how_many_university=" + how_many_university +
                ", person_id=" + person_id +
                '}';
    }
}
