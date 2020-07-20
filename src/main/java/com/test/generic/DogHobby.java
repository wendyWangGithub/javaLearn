package com.test.generic;

public class DogHobby {

    private String name;
    private String hobbyDescription;


    public DogHobby(String name, String hobbyDescription) {
        this.name = name;
        this.hobbyDescription = hobbyDescription;
    }

    public DogHobby(String hobbyDescription) {
        this.hobbyDescription = hobbyDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobbyDescription() {
        return hobbyDescription;
    }

    public void setHobbyDescription(String hobbyDescription) {
        this.hobbyDescription = hobbyDescription;
    }
}
