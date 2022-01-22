package com.Peacsoft.model;

public class City {
    private int id;
    private String name;
    private String location;
    private int how_many_school;
    private int population;
    private int person_id;
    private int country_id;

    public City() {
    }

    public City(int id, String name, String location, int how_many_school, int population, int person_id, int country_id) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.how_many_school = how_many_school;
        this.population = population;
        this.person_id = person_id;
        this.country_id = country_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHow_many_school() {
        return how_many_school;
    }

    public void setHow_many_school(int how_many_school) {
        this.how_many_school = how_many_school;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", how_many_school=" + how_many_school +
                ", population=" + population +
                ", person_id=" + person_id +
                ", country_id=" + country_id +
                '}';
    }
}
