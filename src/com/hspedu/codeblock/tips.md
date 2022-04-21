## 小节
1. static 代码块是在类加载时执行，且只会执行一次
2. 普通代码块是在创建对象时调用的，创建一次就会调用一次
3. 类什么时候加载，类加载的三种情况
4. 创建一个对象时，在一个类调用的顺序是：（<font size = 5 color = yellow>重点，难点</font>）
    * 调用静态代码块和静态属性初始化（<font color = red>注意</font>：静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，按照他们的定义的顺序调用
    * 调用普通代码块和普通属性初始化（<font color = red>注意</font>：普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按照定义顺序调用
    * 调用构造方法