package week8.day2;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

/**
 * @author chenlin
 * @create 2020-09-22  9:17
 */
public class ReflectionTest {

    //没有反射的类操作
    @Test
    public void test(){
        Person person = new Person();
        //通过实列对象调用public方法
        person.getAge();
        person.getName();
        //不能访问内部私有属性和方法
    }
    @Test
    public void test2() throws Exception {
        //通过反射创建Person对象
        Class<Person> personClass = Person.class;
        //反射访问构造器
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        constructor.newInstance("giao",123);

    }
}
