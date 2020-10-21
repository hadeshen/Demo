package week8;

/**
 * @author chenlin
 * @create 2020-09-26  11:48
 */
public class FactoryTest {
    public static void main(String[] args) {
//        IMessage netMessage = Factory.getInstance("netMessage");
//        IMessage netMessage = Factory.getInstance("demo.week8.NetMessage");
        IMessage netMessage = Factory2.getInstance("demo.week8.NetMessage",IMessage.class);
        netMessage.send();
    }
}
class Factory2{
    private Factory2(){};

    /**
     * 获取接口实例化对象
     * @param classname 接口子类
     * @param clazz 接口类型
     * @param <T> 如果接口实例化对象存在返回实例对象
     * @return
     */
    public static <T> T getInstance(String classname,Class<T> clazz){
        T instance = null;
        try {
            instance = (T) Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}
class Factory{
    private Factory(){}//没有产生实例化的意义 私有化
    public static IMessage getInstance(String classname){
        if ("NetMessage".equalsIgnoreCase(classname)){
            return new NetMessage();
        }
        return null;
    }
}
class Factory1{
    private Factory1(){};
    public static IMessage getInstance(String classname){
        IMessage instance = null;
        try {
            instance = (IMessage) Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instance;
    }
}


interface IMessage{
    void send();
}
class NetMessage implements IMessage{

    @Override
    public void send() {
        System.out.println("网络消息发送");
    }
}