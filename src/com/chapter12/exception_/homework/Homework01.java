package com.chapter12.exception_.homework;

/**
 * @author ooah
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

        try {
            // 先验证输入的参数的个数是否正确
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            // 先把接收到的参数转成整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2); // 该方法可能抛出 ArithmeticException
            System.out.println("计算结果是：" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("出现除0的异常");
        }
    }

    // 编写 cal 方法，计算商
    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
