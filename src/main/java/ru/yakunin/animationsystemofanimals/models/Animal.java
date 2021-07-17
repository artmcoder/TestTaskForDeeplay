package ru.yakunin.animationsystemofanimals.models;

public class Animal {
    private String weight;
    private String height;
    private String type;

    public Animal(String weight, String height, String type) {
        this.weight = weight;
        this.height = height;
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Животное: " +
                "вес='" + weight + '\'' +
                ", рост='" + height + '\'' +
                ", тип='" + type + '\'' +
                '}';
    }
}
