package cha3;
import cha3.model.*;

public class Main{
    public static void main(String[] args) {
        Beverage beverage = new Espresson();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new Soy(new Moca(new Moca(new Espresson())));
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());
    }
}