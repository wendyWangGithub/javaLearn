package com.test.reflect;

public class ReflectTest {
//如何获取Class实例（反射）
    public static void main(String[] args) throws ClassNotFoundException{
        //1、调用运行时类本身的class属性
        Class c1 = ReflectTest.class;
        System.out.println(c1 + "获取类名" +  c1.getName());
        System.out.println();
        System.out.println(String.class.getName());
        System.out.println();

        //2、通过运行时类对象获取
        ReflectTest rt = new ReflectTest();
        Class c2 = rt.getClass();
        System.out.println(c2.getName());
        System.out.println();

        //3、通过Class的静态方法获取
        //有异常，因为和file一样，这个Str表示的类可能是不存在的,而第一种方式如果ReflectTest类不存在编译的时候就会报错，str如果找不到运行时候才会报错。
        //通过第三种方式，可以实现反射的动态性，只要str的值改变，后面的操作内容代码不用该，但是输出的内容却会跟着str值的改变而改变。
        String str = "com.test.reflect.ReflectTest";
        Class c3 = Class.forName(str);
        System.out.println(c3.getName());
    }

}
