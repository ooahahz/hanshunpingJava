package com.chapter15.customGeneric;

/**
 * @ClassName CustomInterfaceGeneric
 * @Author Oliver
 * @Date 2022/5/11 17:10
 * Description      TODO
 * @see
 */
@SuppressWarnings("all")
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/*
    1. 接口中，静态成员不能使用泛型
    2. 泛型接口的类型，在继承接口和实现接口时确定
    3. 没有指定类型，默认为 Object
 */

interface IUsb<U, R> {  // 接口中，成员都是静态性质的
    // 普通方法中，可以使用接口泛型
    R get(U u);
//    U name; // 不能这样使用

    void hi(R r);

    void run(R r1, R r2, R r3);

    // 在 jdk8 中，可以在接口中使用默认方法
    default R method(U u) {
        return null;
    }
}

// 在继承接口指定泛型接口的类型
interface IA extends IUsb<String, Double> {

}

// 当我们去实现IA接口时，因为IA在继承IUsb接口时，指定了 U = String   R = Double
// 因此在实现接口的方法时，使用 String 替换 U , 使用 Double 替换 R
class A implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, Double r3) {

    }

    // 实现接口时，直接指定泛型接口的类型
    // 给 U指定Integer ，给 R 指定 Float
    // 所以，当我们实现 IUsb 方法时，会使用 Integer 替换 U，使用 Float 替换 R
    class B implements IUsb<Integer, Float> {

        @Override
        public Float get(Integer integer) {
            return null;
        }

        @Override
        public void hi(Float aFloat) {

        }

        @Override
        public void run(Float r1, Float r2, Float r3) {

        }
    }



    // 没有指定类型，默认为 Object
    // 建议直接写成 IUsb<Object, Object>
    class CC implements IUsb{

        @Override
        public Object get(Object o) {
            return null;
        }

        @Override
        public void hi(Object o) {

        }

        @Override
        public void run(Object r1, Object r2, Object r3) {

        }
    }
}