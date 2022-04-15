package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", 23);
        Student student1 = new Student("Marry", 15, 100);
        Student student2 = new Student("Tom", 23, 88);
        Teacher teacher1 = new Teacher("Jay", 55, 6000);
        Teacher teacher2 = new Teacher("Harrison", 34, 8000);

        Person[] arr = new Person[5];
        arr[0] = person1;
        arr[1] = student1;
        arr[2] = student2;
        arr[3] = teacher1;
        arr[4] = teacher2;

        for (Person person : arr) {
            // arr[i] 编译类型是 Person, 运行类型根据实际情况由 JVM 来判断
            System.out.println(person.say()); // 动态绑定机制

            if (person instanceof Student) {
                ((Student)person).study(); // 向下转型
            }else if (person instanceof Teacher) {
                ((Teacher)person).teach();
            }else if (person instanceof Person) {

            }else {
                System.out.println("你的类型有误，请检查...");
            }
        }
    }
}
