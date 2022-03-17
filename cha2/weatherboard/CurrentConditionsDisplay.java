package cha2.weatherboard;

import cha2.myinterface.DisplayElement;
import cha2.myinterface.Observer;
import cha2.myinterface.Subject;

/**
 * 实现了 Observer 接口的观察者 (DisplayElement是一个策略接口，与观察者模式无关)
 * 该类的成员变量如下
 * temperature、humidity 存放接收到的推送消息的数据域
 * weatherData 对象 持有的 Subject 对象，持有这个对象用于的解除注册，停止接受消息
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // 构造方法，将自己注册为一个观察者
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /** 
     * 实现了 Observer 接口的 update 方法
     * 该方法会通过参数赋值的方法，将接收到的消息赋值给成员变量
     * */    
    @Override
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        // 这里直接调用 display 方法是为了更直观地测试观察者模式地效果
        display();
    }

    @Override
    public void display(){
        System.out.println("Current condations: " + temperature + " F degrees and " +  
        " humidity " + humidity + "% humidity");
    }
}
