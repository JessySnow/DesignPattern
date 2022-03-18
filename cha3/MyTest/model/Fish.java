package cha3.MyTest.model;

public class Fish implements Dish{
    
    @Override
    public String getDescription() {
        return "This is a fish with";
    }
    
    @Override
    public double cost() {
        return 50.0;
    }
}
