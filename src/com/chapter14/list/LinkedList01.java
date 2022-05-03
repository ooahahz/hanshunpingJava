package com.chapter14.list;

/**
 * @ClassName LinkedList01
 * Description
 * @Author haohao
 * @Date 2022/5/3 17:59
 */
public class LinkedList01 {
    public static void main(String[] args) {

        Node jack = new Node("Jack");
        Node tom = new Node("Tom");
        Node marry = new Node("Marry");
        // 连接三个节点形成双向链表
        jack.next = tom;
        tom.next = marry;
        marry.pre = tom;
        tom.pre = jack;

        Node first = jack; // 让头节点指向 jack
        Node last = marry; // 让尾节点指向 marry

        // 演示从头到尾进行遍历
//        for (Node node = first; node != null; node=node.next) {
//            System.out.println(node.item);
//        }
        while (first != null) {
            System.out.println(first.item);
            first = first.next;
        }

        System.out.println("=================");
        // 从尾到头遍历
        while (last != null) {
            System.out.println(last.item);
            last = last.pre;
        }

        // 演示链表添加对象/数据，很方便
        // 要求，在 tom 和 jack 之间添加一个 smith
        // 1. 先创建一个 Node smith 结点
        Node smith = new Node("Smith");
        smith.next = marry;
        smith.pre = tom;
        marry.pre = smith;
        tom.next = smith;

        // 从头到尾遍历
        System.out.println("=============");
        first = jack;
        while (first != null) {
            System.out.println(first.item);
            first = first.next;
        }
    }
}

// 定义一个 Node 类， Node 对象表示双向链表的一个结点
class Node {
    public Object item;
    public Node next; // 指向后一个结点
    public Node pre; // 指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name" + item;
    }
}
