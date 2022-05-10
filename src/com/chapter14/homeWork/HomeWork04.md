## 试分析：HashSet 和 TreeSet 分别如何实现去重的

(1) HashSet 的去重机制：hashCode() + equals()，底层先存入对象，进行运算得到
一个 hash 值，通过 hash 值得到对应的索引，如果发现 table 索引所在的位置没有
数据，就直接存放，如果有元素就进行 equals() 遍历比较(可以对equals进行重写，自己定义相等)
，如果比较后不相同就加入，否则就不加入

(2) TreeSet的去重机制：如果你传入了一个Comparator比较器(匿名对象)，就是用
实现的compare去重，如果方法返回 0 ，就认为是相同的元素，就不添加，如果没有传入
一个Comparator 匿名对象，则以你添加的对象实现的Comparable接口的compareTo方法
去重

