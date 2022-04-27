package com.chapter12.customException_;

/**
 * @author ooah
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) /*throws AgeException*/{

        int age = 10;
        // 要求年龄在 18-120 之间，否则抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18-120");
        } else {
            System.out.println("你的年龄范围是正确的");
        }
    }
}

// 自定义地一个异常
// 1. 一般情况下，我们自定义异常是继承 RuntimeException
// 2. 即把自定义异常做成 运行时异常，好处是我们可以使用默认的处理机制
// 3. 比较方便
class AgeException extends RuntimeException /*Exception*/ {
    public AgeException(String message) {
        super(message);

    }
}
