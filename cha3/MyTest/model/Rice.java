package cha3.MyTest.model;

public class Rice extends AdditionDish{

    public Rice(Dish mainDish){
        super(mainDish);
    }

    @Override
    public String getDescription() {
        return mainDish.getDescription() + " Rice ";
    }

    @Override
    public double cost() {
        return 0.53 + mainDish.cost();
    }
}
