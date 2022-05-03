package com.chapter14.list;

import java.util.Vector;

/**
 * @ClassName Vector_
 * Description
 * @Author haohao
 * @Date 2022/5/3 17:02
 */
@SuppressWarnings({"all"})
public class Vector_ {
    public static void main(String[] args) {
        // 无参构造
        // 大小默认 10 ，满后按 2 倍扩容
        // 有参构造
        // 指定大小，每次直接按 2 倍扩容，或者指定扩容大小
        Vector<Object> vector = new Vector<>();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println(vector);

        // 1.  public Vector() {
        //        this(10);
        //     }

//        public synchronized void ensureCapacity(int minCapacity) {
//            if (minCapacity > 0) {
//                modCount++;
//                ensureCapacityHelper(minCapacity);
//            }
//        }

//        public synchronized boolean add (E e){
//            modCount++;
//            ensureCapacityHelper(elementCount + 1);
//            elementData[elementCount++] = e;
//            return true;
//        }

//        private void ensureCapacityHelper(int minCapacity) {
//            // overflow-conscious code
//            if (minCapacity - elementData.length > 0)
//                grow(minCapacity);
//        }
    }
}
