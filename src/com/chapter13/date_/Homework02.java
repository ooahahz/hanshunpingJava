package com.chapter13.date_;

/**
 * @ClassName Homework02
 * Description
 * @Author haohao
 * @Date 2022/5/2 17:20
 */
public class Homework02 {
    public static void main(String[] args) {
        String name = "Jack";
        String pwd = "123456";
        String email = "jack@souhu.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("恭喜你，注册成功~~~");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /*
     * 输入用户名、密码、邮箱、如果录入信息正确，则提示注册成功，否则生成异常对象
     * 要求：
     *  (1) 用户名长度为 2 或 3 或 4
     *  (2) 密码长度为 6，要求全是数字 isDigital
     *  (3) 邮箱中包含 @ 和 . 并且 @ 在 . 前面
     *
     * 思路分析：
     * (1) 先编写方法 userRegister(String name, String pwd, String email) {}
     * (2) 针对输入的内容进行校验，如果发现问题，就抛出异常，给出提示
     * (3) 单独地写一个方法，判断密码是否全部是数字字符
     */

    public static void userRegister(String name, String pwd, String email) {
        // 过关
        // 第一关
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度要求为2、3、4");
        }
        // 第二关
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度为 6，要求全是数字");
        }
        // 第三关
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱中包含 @ 和 . 并且 @ 在 . 前面");

        }
    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
