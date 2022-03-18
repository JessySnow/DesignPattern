package cha3.MyTest.model;

public class Chicken implements Dish{
        
    @Override
    public String getDescription() {
        return "This is a Chicken with";
    }
    
    @Override
    public double cost() {
        return 25.2;
    }
}
