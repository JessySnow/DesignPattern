package cha3.model;

public class Soy extends Condiment{
    private Beverage beverage;

    public Soy(Beverage beverage){
        description = " Soy ";
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + this.description;
    }

    @Override
    public double cost() {
        return 0.5 + beverage.cost();
    }
}
