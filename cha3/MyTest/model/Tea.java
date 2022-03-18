package cha3.MyTest.model;

public class Tea extends AdditionDish{

    public Tea(Dish dish){
        super(dish);
    }

    @Override
    public String getDescription() {
        return this.mainDish.getDescription() + " Tea ";
    }

    @Override
    public double cost() {
        return 0.25 + this.mainDish.cost();
    }
}
