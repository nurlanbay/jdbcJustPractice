package com.Peacsoft.model;

public class President {
    private int id ;
    private String first_name;
    private String last_name;
    private String gender;
    private String gate_of_birth;

    public President() {
    }

    public President(int id ,String first_name, String last_name, String gender, String gate_of_birth) {
        this.id=id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.gate_of_birth = gate_of_birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGate_of_birth() {
        return gate_of_birth;
    }

    public void setGate_of_birth(String gate_of_birth) {
        this.gate_of_birth = gate_of_birth;
    }

    @Override
    public String toString() {
        return "President{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", gate_of_birth='" + gate_of_birth + '\'' +
                '}';
    }
}
