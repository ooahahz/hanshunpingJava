package com.chapter12.exception_;

/**
 * @author ooah
 * @version 1.0
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {

        // 1. 如果 try 代码块有多个异常，可以使用多个catch捕获不同的异常，相应的做处理
        // 2. 要求子类异常写在前面，父类异常写在后面
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName()); // NullPointerException

            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2; // ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算数异常：" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally { // 必须执行

        }
    }
}

class Person {
    private String name = "Jack";

    public String getName() {
        return name;
    }
}
