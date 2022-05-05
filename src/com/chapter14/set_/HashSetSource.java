package com.chapter14.set_;

import java.util.HashSet;

/**
 * @ClassName HashSetSource
 * @Description
 * 1. HashSet 底层是 HashMap
 * 2. 添加一个元素时，先得到 Hash 值，然后会转成索引值
 * 3. 找到存储数据表 table，看这个索引位置是否已经存放有元素
 * 4. 如果没有，直接加入
 * 5. 如果有，调用 equals 比较，如果相同，则放弃添加，如果不相同，则添加到最后
 * 6. 在 Java8 中，如果一条链表的元素个数到达 TREEIFY_THRESHOLD（默认是8），并且
 *    table 的大小>= MIN_TREEIFY_CAPACITY（默认64），就会进行树化（红黑树）
 * @Author haohao
 * @Date 2022/5/5 13:39
 */
@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {

        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set = " + hashSet);

        /*
        源码解读
        1. 执行构造器 HashSet();
            public HashSet() {
                map = new HashMap<>();
             }
        2. 执行 add()
            public boolean add(E e) {
                return map.put(e, PRESENT)==null; // PRESENT // Dummy value to associate with an Object in the backing Map private static final Object PRESENT = new Object();
            }
.       3. 执行 put() ，该方法会执行 hash(key) 得到 key 对应的 hash 值(不是 hashCode，对应一个算法，如下）
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }

                   static final int hash(Object key) {
                        int h;
                        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
                    }
        4. putVal()
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i; // 定义了辅助变量
            // table 就是 HashMap 的一个数组，类型是 Node[]
            // if 语句表示如果当前 table 是 null，或者大小 = 0
            // 就是第一次扩容，到16个空间
            if ((tab = table) == null || (n = tab.length) == 0)
                n = (tab = resize()).length;
            // (1) 根据 key 得到的 hash 值，应该存放到 table 表的哪个索引位置
            // 并把这个位置的结点对象赋给 p
            // (2) 判断 p 是否为 null，表示还没有存放过元素，就创建一个 Node
            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null);
            else {
                // 一个开发技巧提示：在需要局部变量（辅助）的时候创建比较好
                Node<K,V> e; K k;
                if (p.hash == hash && //如果当前索引位置对应的链表的第一个元素的 hash 值和准备添加的 key 的 hash 值相同时
                // 并且满足下面两个条件之一（待加入元素的 key 和 p 指向的 Node 的 key 是同一个对象 或者 对象的值(属性)相同）
                // 就不能往里面加入了
                    ((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
                // 再判断 p 是不是一颗红黑树
                // 如果是一颗红黑树，就调用 putTreeVal，来进行添加
                else if (p instanceof TreeNode)
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                else { // 如果 table 对应的索引位置已经是一个链表了，就使用 for 依次比较
                       // （1）依次和该链表的每个元素比较后都不相同，说明添加的元素是没有重复的，把该元素加入到链表的末尾
                       //     注意把元素添加到链表后，立即判断该链表是否已经达到 8 个结点，
                              就调用 treeifyBin() 对当前这个链表进行树化（转成红黑树）
                              在转成红黑树时还进行判断，判断条件
                              if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
                                resize();
                              如果上面条件成立，先对 table 扩容
                              只有上面条件不成立时，才对当前链表树化
                       // （2）依次和链表中的元素比较的过程中，如果有相同的元素，就直接 break
                    for (int binCount = 0; ; ++binCount) {
                        if ((e = p.next) == null) {
                            p.next = newNode(hash, key, value, null);
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        if (e.hash == hash &&
                            ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;
                    }
                }
                if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value;
                    afterNodeAccess(e);
                    return oldValue;
                }
            }
            ++modCount;
            if (++size > threshold)
                resize();
            afterNodeInsertion(evict);
            return null;
        }
         */
    }
}
