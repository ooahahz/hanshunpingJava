package com.chapter15.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @ClassName Homework01
 * @Author Oliver
 * @Date 2022/5/11 20:36
 * Description      TODO
 * @see
 */
public class Homework01 {
    public static void main(String[] args) {

        DAO<User> userDAO = new DAO<>();
        userDAO.save("12",new User(12, 15, "Jack"));
        userDAO.save("13",new User(13, 14, "Marry"));
        userDAO.update("12",new User(12, 18, "Tom"));
        userDAO.update("14", new User(14, 44, "Candy"));

        System.out.println(userDAO.list());
        System.out.println(userDAO.get("12"));
        System.out.println("========delete========");
        userDAO.delete("13");
        System.out.println(userDAO.list());
    }

    @Test
    public void testList() {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("12",new User(12, 15, "Jack"));
        userDAO.save("14",new User(12, 15, "Jack"));
        userDAO.save("13",new User(13, 15, "Smith"));
        System.out.println(userDAO.list());
    }
}

class DAO<T> { // 泛型类

    public Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        for (String s : map.keySet()) {
            if (id.equals(s)) {
                map.put(id, entity);
            }
        }
    }

    public List<T> list() {
//        return new ArrayList<>(map.values());

        List<T> list = new ArrayList<>();
        // 遍历map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
//            list.add(map.get(key));
            list.add(get(key)); // 本类的 get方法
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
