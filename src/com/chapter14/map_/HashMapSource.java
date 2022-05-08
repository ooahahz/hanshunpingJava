package com.chapter14.map_;

import java.util.HashMap;

/**
 * @ClassName HashMapSource
 * @Author Oliver
 * @Date 2022/5/7 17:47
 * Description      TODO
 * HashMap 源码解读
 * @see HashMap
 */
@SuppressWarnings("all")
public class HashMapSource {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("java", 10);// OK
        map.put("php", 10); // OK
        map.put("java", 20); // 替换

        System.out.println("map = " + map);

        /*
        // 解读 HashMap 源码
         1. 执行构造器 new HashMap()
            初始化加载因子 loadfactor = 0.75
            HashMap$Node[] table = null
         2. 执行put 调用 hash 方法，计算 key 的 Hash 值
            public V put(K key, V value) {
                return putVal(hash(key), key, value, false, true);
            }
            static final int hash(Object key) {
                int h;
                return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
            }
         3.
        final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i; // 辅助变量
            // 如果底层的 table 数组
            if ((tab = table) == null || (n = tab.length) == 0)
                n = (tab = resize()).length;
                // 取出 hash 值对应的 table 索引位置的 Node，如果为 null ，就直接加入 k-v
                // 创建一个 Node 加入到该位置
            if ((p = tab[i = (n - 1) & hash]) == null)
                tab[i] = newNode(hash, key, value, null);
            else {
                Node<K,V> e; K k; // 辅助变量
                // 如果 table 的索引位置的 key 的 hash 值 和新的 key 的 hash 值相同，
                // 并满足（table 现有的结点的 key 和准备添加的 key 是同一个对象 || equals 返回为真）
                // 就认为不能加入新的 k-v
                if (p.hash == hash &&
                    ((k = p.key) == key || (key != null && key.equals(k))))
                    e = p;
                else if (p instanceof TreeNode) // 如果当前的 table 的已有的 Node 是红黑树，就按照红黑树的方式处理
                    e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                else {
                    // 如果找到的结点，后面是链表，就遍历比较
                    // 死循环，后面有两个 break 出口
                    for (int binCount = 0; ; ++binCount) {
                        if ((e = p.next) == null) { // 如果整个链表没有和他相同的，就加到该链表的末尾
                            p.next = newNode(hash, key, value, null);
                            // 加入后，判断当前链表的个数是否已经到达 8 个，
                            // 到达 8 个后，就调用红黑树树化
                            if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                treeifyBin(tab, hash);
                            break;
                        }
                        if (e.hash == hash && // 如果在循环比较过程中发现有相同的就不添加，直接break，就只替换 value
                            ((k = e.key) == key || (key != null && key.equals(k))))
                            break;
                        p = e;
                    }
                }
                if (e != null) { // existing mapping for key
                    V oldValue = e.value;
                    if (!onlyIfAbsent || oldValue == null)
                        e.value = value; // 将旧的值替换为新的值
                    afterNodeAccess(e);
                    return oldValue;
                }
            }
            ++modCount; // 每增加一个 Node ，就 size++
            if (++size > threshold)
                resize();
            afterNodeInsertion(evict);
            return null;
        }

        5. 关于树化
        // 如果 table 为 null ，或者大小还没到达 64，暂时不树化，而是进行扩容
        // 否则才会真正树化
        // 剪枝  树 ---> 链表
        final void treeifyBin(Node<K,V>[] tab, int hash) {
        int n, index; Node<K,V> e;
        if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
            resize();
        else if ((e = tab[index = (n - 1) & hash]) != null) {
            TreeNode<K,V> hd = null, tl = null;
            do {
                TreeNode<K,V> p = replacementTreeNode(e, null);
                if (tl == null)
                    hd = p;
                else {
                    p.prev = tl;
                    tl.next = p;
                }
                tl = p;
            } while ((e = e.next) != null);
            if ((tab[index] = hd) != null)
                hd.treeify(tab);
        }
    }
         */
    }
}
