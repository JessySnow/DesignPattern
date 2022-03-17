package cha3.model;

public abstract class Beverage {
    String description = "Unknown Beverlage";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}
