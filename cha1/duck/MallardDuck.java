package cha1.duck;

public class MallardDuck extends Duck{
    
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void disPlay(){
        System.out.println("I'm MallardDuck");
    }

    public static void main(String[] args) {
        MallardDuck md = new MallardDuck(new FlyBehavior() {
            public void fly(){
                System.out.println("I can fly");    
            }
        }, new QuackBehavior() {
            public void quack(){
                System.out.println("I can quack");
            }
        });

        md.performFly();
        md.performQuack();
    }
}