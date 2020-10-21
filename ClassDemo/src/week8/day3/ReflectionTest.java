package week8.day3;

import org.junit.jupiter.api.Test;
import week8.day2.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author chenlin
 * @create 2020-09-23  11:44
 */
public class ReflectionTest {
    @Test
    public void test() throws Exception {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        //获取指定属性
        Field name = personClass.getDeclaredField("name");
        //属性有private修饰 外部不能修改 则将属性改为可访问的
        //保证当前属性可访问  规范操作
        name.setAccessible(true);
        name.set(person,"giao");
        System.out.println(name.get(person));

        //获取方法
        //getDeclaredMethod():参数一为方法名 参数二为形参列表的数据类型
        Method show = personClass.getDeclaredMethod("show", String.class);
        //将方法设置为可访问的  规范操作
        show.setAccessible(true);
        //invoke():参数一为调用对象 参数二为赋值的实参
        show.invoke(person,"中国");

        //调用静态方法
        Method say = personClass.getDeclaredMethod("say", String.class);
        //将方法设置为可访问
        say.setAccessible(true);
        say.invoke(person,"汉语");

        //获取构造器
        //getDeclaredConstructor():参数为构造器中的参数列表
        Constructor<Person> constructor = personClass.getDeclaredConstructor(String.class,int.class);
        //构造器可访问
        constructor.setAccessible(true);
        //通过构造器创建对象
        Person person1 = constructor.newInstance("小明", 20);


    }
}
