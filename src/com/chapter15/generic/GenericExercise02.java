package com.chapter15.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @ClassName Test
 * @Author Oliver
 * @Date 2022/5/11 15:35
 * Description      TODO
 * @see Employee
 */
@SuppressWarnings("all")
public class GenericExercise02 {
    public static void main(String[] args) {
        Employee jack = new Employee("Candy", 4000, new Mydate(12, 1, 1983));
        Employee marry = new Employee("Marry", 5000, new Mydate(4, 22, 1980));
        Employee candy = new Employee("Candy", 5000, new Mydate(12, 2, 1983));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(jack);
        employees.add(marry);
        employees.add(candy);
        System.out.println(employees);

        System.out.println("============对员工进行排序===========");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                // 先对传入的参数进行验证
                if (!(employee1 instanceof Employee && employee2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                // 比较名字
                int i = employee1.getName().compareTo(employee2.getName());
                if (i != 0) {
                    return i;
                }

                // 下面是对 birthday 的比较，因此我们最好把这个比较放在 MyDate 类完成
                // 封装后，将来可维护性和复用性就大大增强
                return employee1.getBirthday().compareTo(employee2.getBirthday());

            }
        });
        System.out.println(employees);


    }
}
