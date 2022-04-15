package com.hspedu.encap;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack我爱你");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        // 如果我们自己使用构造器指定属性
        Person smith = new Person("Smith", 2000, 50000);
        System.out.println("===== Smith的信息 =====");
        System.out.println(smith.info());
    }

}

class Person {
    public String name; // 名字公开
    private int age; // 年龄私有化
    private double salary;

    // 构造器


    public Person() {
    }

    // 有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        // 我们可以将 set 方法写在构造器中，这样仍然可以验证传入数据的限制
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    // 自己写 set 和 get 方法太慢，我们使用快捷键
    // 然后根据要求来完善代码
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验，相当于增加了业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要（2-6）个字符，给你默认名字");
            this.name = "Dog";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，需要在1-120，给你默认年龄为18");
            this.age = 18; // 给一个默认年龄
        }
    }

    public double getSalary() {
        // 可以这里增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 写一个方法，返回属性信息
    public String info() {
        return "信息为: name = " + name + " age = " + age + " 薪水 = " + salary;
    }
}
