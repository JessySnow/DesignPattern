package cha3.MyTest.model;

public  class AdditionDish implements Dish{
    protected Dish mainDish;

    public AdditionDish(Dish mainDish){
        this.mainDish = mainDish;
    }

    @Override
    public String getDescription() {
        return mainDish.getDescription() + " Default additional dish ";
    }

    @Override
    public double cost() {return 0;}
}
