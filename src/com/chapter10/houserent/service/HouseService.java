package com.chapter10.houserent.service;

import com.chapter10.houserent.domain.House;

/**
 * 定义 House[] 保存 House 对象
 * 1. 响应 HouseView 的调用
 * 2. 完成对房屋信息的各种操作（增删改查）
 */
public class HouseService {

    private House[] houses; // 用于存放 House 对象
    private int houseNums = 1; // 记录当前有多少个房屋信息
    private int idCounter = 1; // 记录当前 id 自增长到哪个值了

    public HouseService(int size) {
        // new houses
        houses = new House[size]; // 当创建 HouseService 对象时，指定数组大小
        // 为了配合测试列表信息，初始化一个 House 对象
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
    }

    // list 方法，返回 houses
    public House[] list() {
        return houses;
    }

    // add 方法，添加新对象，返回 boolean
    public boolean add(House newHouse) {

        // 判断是否还可以继续添加（暂时不考虑数组扩容的问题）
        if (houseNums >= houses.length) { // 不能在添加了
            System.out.println("数组已满，不能再添加了");
            return false;
        }
        houses[houseNums++] = newHouse; // 将 newHouse 加入到最后一个房屋信息后面

        // 需要设计一个 id 自增长机制
        newHouse.setId(++idCounter); // 先++，再 setId

        return true;
    }

    // delete 方法，删除一个房屋信息
    public boolean del(int delId) {
        // 应当先找到待删除的房屋信息对应的下标
        // 强调：一定要搞清楚下标和房屋的编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) { // 要删除的房屋对应的 id，在数组下标为 i 的元素
                index = i; // 使用 idex 记录 i
            }
        }
        if (index == -1) { // 说明delId 在数组中不存在
            return false;
        }
        // 如果找到，这里需要删除相关房屋的信息
        for (int i = index; i < houseNums-1; i++) {
                houses[i] = houses[i+1];

        }

        houses[--houseNums] = null; // 把当有存在的房屋信息的最后一个设置为 null

        return true;
    }

    // find 方法
    public House findById(int id) {
        for (int i = 0; i < houseNums; i++) {
            if (id == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

}
