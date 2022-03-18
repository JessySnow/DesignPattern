package cha5;

/**
 * 单例模式的实现类
 */
public class Container {
    // 定义一个 volatile 修饰的 int 数组，作为哦
    private volatile static Container container;

    // 此处采用了 饿汉式 的单例实现，因为静态域会在差生类引用之前初始化，所以也可以保证该实例只有一个
    // 但是 饿汉式 的单例实现，不能将初始化过程延迟
    // 好处是后面获取该实例时就不用加锁了，因为该实例在类载入的过程中就已经创建完毕
    // private volatile static Container container = new Container();


    @Override
    public String toString() {
        return "这是一个单例类，当前的程序中，我是独一无二的";
    }

    // 返回单例类实例的方法
    public static Container getInstance(){
        if(container == null){
            /**
             * 由于返回实例的是静态方法，所以需要同步当前的类，而不是对象
             * 此处采用了 懒汉式 的单例实现，即将初始化的过程延迟
             */
            synchronized(Container.class){
                container = new Container();
                return container;
            }
        }

        return container;
    }
}
