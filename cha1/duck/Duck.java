package cha1.duck;

/**
 * 鸭子类的公共父类，设置为一个虚类
 * 无法被初始化
 */
public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public abstract void disPlay();
}