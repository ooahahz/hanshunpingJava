package com.chapter10.houserent.view;

import com.chapter10.houserent.domain.House;
import com.chapter10.houserent.service.HouseService;
import com.chapter10.houserent.utils.Utility;

/**
 * 1. 显示界面
 * 2. 接收用户的输入
 * 3. 调用 HouseService 完成对访问信息的各种操作
 */
public class HouseView {

    private boolean loop = true; // 控制显示菜单
    private char key = ' '; // 接收用户选择
    private HouseService houseService = new HouseService(3);

    // 这里我们使用 Utility 提供方法，完成退出确认
    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    // 根据 id 查找房屋信息的功能
    public void findHouse() {
        System.out.println("==================查找房屋信息===================");
        System.out.print("请输入需要查找房屋的ID: ");
        int id = Utility.readInt(); // 接收用户的输入
        House house = houseService.findById(id);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("===============查找房屋信息不存在=============");
        }

    }

    // 修改房屋信息
    public void changeHouseInfo() {
        System.out.println("=====================修改房屋======================");
        System.out.print("请输入待修改房屋编号(-1退出): ");
        int id = Utility.readInt();

        if (id == -1) {
            System.out.println("================你放弃了修改房屋信息=============");
            return;
        }

        // 特别提醒，返回的是引用类型[即：就是数组中的元素]
        // 因此在后面 house.setXXX(), 就会修改 HouseService 中 houses 数组的元素
        // 根据输入得到的id，查找对象
        House house = houseService.findById(id);
        if (house != null) {
            System.out.println("姓名(" + house.getName() + "): ");
            String newName = Utility.readString(10, ""); // 如果这里用户直接回车，表示不修改该信息,默认“”
            if (!"".equals(newName)) {
                house.setName(newName);
            }

            System.out.println("电话(" + house.getPhone() + "): ");
            String newPhone = Utility.readString(10, "");
            if (!"".equals(newPhone)) {
                house.setPhone(newPhone);
            }

            System.out.println("地址(" + house.getAddress() + "): ");
            String newAddress = Utility.readString(10, "");
            if (!"".equals(newAddress)) {
                house.setAddress(newAddress);
            }

            System.out.println("租金(" + house.getRent() + "): ");
            int newRent = Utility.readInt(-1);
            if (newRent != -1) {
                house.setRent(newRent);
            }

            System.out.println("状态(" + house.getState() + "): ");
            String newState = Utility.readString(10, "");
            if (! "".equals(newState)) {
                house.setState(newState);
            }

        } else {
            System.out.println("=============输入编号对应的房屋不存在================");
            return;
        }

        System.out.println("=====================修改完成======================");
    }


    // 编写delHouse() 接收输入的 id ，调用 Service 的 del 方法
    public void delHouse() {
        System.out.println("=====================删除房屋信息=========================");
        System.out.println("请输入待删除房屋的编号（-1表示退出）：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=================放弃删除房屋信息=====================");
            return;
        }
        char choice = Utility.readConfirmSelection(); // 该方法本身就有循环判断的逻辑，必须输入 y/n
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("==============删除房屋信息成功===================");
            } else {
                System.out.println("=============房屋编号不存在，删除失败==============");
            }

        } else {
            System.out.println("==================放弃删除====================");
        }
    }

    // 编写 addHouse() 接收输入，创建 House 对象，调用 add 方法
    public void addHouse() {
        System.out.println("=======================添加房屋========================");
        System.out.print("姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话号码: ");
        String phone = Utility.readString(12);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        int rent = Utility.readInt();
        System.out.print("状态: ");
        String state = Utility.readString(3);

        // 创建一个新的 House 对象，注意 id 是系统分配的。新添加的房屋编号按照自增长的方式。
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("======================添加房屋成功=======================");
        } else {
            System.out.println("======================添加房屋失败=======================");
        }


    }

    // 编写 listHouse() 显示房屋列表
    public void listHouses() {
        System.out.println("=========================房屋列表======================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list(); // 得到所有的房屋信息
        for (House house :houses) {
            if (house == null) {
                break;
            }
            System.out.println(house);
        }
        System.out.println("======================房屋列表显示完毕===================");
    }

    // 显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n============房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 房 源 ");
            System.out.println("\t\t\t2 查 找 房 屋 ");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6   退 出");
            System.out.println("请输入你的选择（1-6）：");
            key = Utility.readChar();

            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    changeHouseInfo();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while(loop);
    }
}
