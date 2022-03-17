package cha3.model;

public class Moca extends Condiment {
    Beverage beverage;

    public Moca(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Moca";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
