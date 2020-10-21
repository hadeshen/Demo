package week8.day3;

import org.junit.jupiter.api.Test;
import week8.day2.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @author chenlin
 * @create 2020-09-23  9:39
 * 通过反射创建运行时类对象
 */
public class NewInstanceTest {
    @Test
    public void test() throws Exception {
        Class<Person> personClass = Person.class;
        // 访问类中的构造器  构造器必须是空参构造器
        // 用newInstance创建对象必须提供空参构造器 访问权限是public
        Person person = personClass.newInstance();
        //获类字段 只能获取public修饰的字段
        Field[] fields = personClass.getFields();
        //获取类中的所有属性，不包含父类中声明的属性
        Field[] declaredFields = personClass.getDeclaredFields();
        //获取类中所有public方法及其父类中public方法
        Method[] methods = personClass.getMethods();
        //获取类中所有方法 不包含父类方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        //获取类中public修饰的构造器
        Constructor[] constructors = personClass.getConstructors();
        //获取所有构造器
        Constructor<?>[] declaredConstructors = personClass.getDeclaredConstructors();
        //获取父类
        Class<? super Person> superclass = personClass.getSuperclass();
        //获取带泛型的父类
        Type genericSuperclass = personClass.getGenericSuperclass();
        //获取接口
        Class<?>[] interfaces = personClass.getInterfaces();

    }
}
