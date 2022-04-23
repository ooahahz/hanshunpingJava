## final 关键字

* final 可以修饰类、属性、方法和局部变量

在下列情况下，可能会用到 final
1. 在不希望类被继承时，可以用 final 修饰
2. 当不希望父类的某个方法被子类覆盖/重写(override) 时，可以用 final 关键字修饰
3. 当不希望类的某个属性值被修改时，可以用 final 修饰
4. 当不希望某个局部变量被修改，可以用 final 修饰

* final 使用注意事项和细节讨论
    * final 修饰的属性又叫常量，一般用 XX_XX_XX来命名
    * final 修饰的属性在定义时，必须赋初值，并且以后不再修改，赋值可以在如下位置之一：
      * 定义时：如 public final double TAX_RATE = 0.08;
      * 在构造器中
      * 在代码块中
      * 如果final修饰的属性是静态的，则初始化的位置只能是
         * 定义时
         * 在静态代码块，不能在构造器中赋值
    * final 类不能继承，但可以实例化对象
    * 如果类不是final类，但含有final方法，则该方法不能重写，但是可以被继承
    * 一般来说，如果一个类已经是 final 类了，就没有必要再将方法修饰成 final 方法
    * final 不能修饰构造方法（即构造器）
    * final 和 static 往往搭配使用，效率更高，不会导致类加载。底层编译器做了优化处理
      ```java
      class Demo {
           public static final int i = 16;
           static {
               System.out.println("hello");
           }
      }
      ```
    * 包装类（Integer, Double Float, Boolean 等等都是 final 的），String也是final类
  