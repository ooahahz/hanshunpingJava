package com.chapter14.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @ClassName LinkedListCRUD
 * Description
 * @Author haohao
 * @Date 2022/5/3 19:48
 */
public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);

        // 演示删除结点
        linkedList.remove();
        /*  源码：
         *     public E remove() {
                        return removeFirst();
               }

            public E removeFirst() {
                final Node<E> f = first;
                if (f == null)
                    throw new NoSuchElementException();
                return unlinkFirst(f);
            }

         *     private E unlinkFirst(Node<E> f) { // 删除双端链表的第一个结点
         *         // assert f == first && f != null;
         *         final E element = f.item;
         *         final Node<E> next = f.next;
         *         f.item = null;
         *         f.next = null; // help GC
         *         first = next;
         *         if (next == null)
         *             last = null;
         *         else
         *             next.prev = null;
         *         size--;
         *         modCount++;
         *         return element;
         *     }
         */

        linkedList.set(1, 999);
        System.out.println(linkedList);
        
        System.out.println(linkedList.get(1));

        // 因为 LinkedList 实现了 List 接口，遍历方式
        System.out.println("========使用迭代器遍历LinkedList======");
        Iterator<Object> iterator = linkedList.iterator(); // 迭代器
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

        System.out.println("=========增强for循环=======");
        for (Object o : linkedList) {
            System.out.println(o);
        }

        System.out.println("=====普通for循环===========");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        // 源码阅读
        /* 1. 构造器
           public LinkedList() {
           }
           2. 这时 linkedList 的属性 first = null last = null

           3.  public boolean add(E e) {
                    linkLast(e);
                    return true;
               }

           4. 将新的结点，加入到双向链表的最后
           void linkLast(E e) {
                final Node<E> l = last;
                final Node<E> newNode = new Node<>(l, e, null);
                last = newNode;
                if (l == null)
                    first = newNode;
                else
                    l.next = newNode;
                size++;
                modCount++;
            }
         */
    }
}
