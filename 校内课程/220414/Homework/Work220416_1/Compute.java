package Work220416_1;
/**
 @ THIS FILE IS PART OF mole9630 PROJECT
 @ Compute.java - This is the java homework for April 17th
 @ THIS PROGRAM IS FREE Code, IS LICENSED UNDER GPL3 License
 @ Copyright (c) 2022 mole9630(Github)
 @ www.mole9630.top | me@mole9630.top

 * 利用多态思想设计一个计算器程序。其中：
 * 1.定义一个计算类Compute，成员包括两个操作数（float类型）、构造方法和一个计算方法compute（ ）等；
 * 2.分别定义Compute的子类Add（加）、Sub（减）、Mul（乘）、Div（除），分别在这些子类中重写compute方法，实现加减乘除功能。
 * 3.定义一个计算器类Computer，包含一个用于进行四则运算的静态方法four（），方法参数为Compute类的对象。
 * 4.定义一个测试类，测试计算器的四则运算功能。要求调用Computer类的静态方法实现。
 */
public class Compute {
    float a, b;

    //构造无参构造方法
    Compute () {
    }
    //构造有参构造方法
    public Compute(float a, float b) {
        this.a = a;
        this.b = b;
    }

    //创建Add子类
    class Add extends Compute{
        public Add(float a, float b) {
            super(a, b);
        }
    }
    //创建Sub子类
    class Sub extends Compute{
        public Sub(float a, float b) {
            super(a, b);
        }
    }

    //创建Mul子类
    class Mul extends Compute{
        public Mul(float a, float b) {
            super(a, b);
        }
    }

    //创建Div子类
    class  Div extends Compute{
        public Div(float a, float b) {
            super(a, b);
        }
    }


    //定义计算器类Computer
    class Computer extends Compute{
        public Computer(float a, float b) {
            super(a, b);
        }
        //定义加法方法
        public float add() {
            return a + b;
        }
        //定义减法方法
        public float sub() {
            return a - b;
        }
        //定义乘法方法
        public float mul() {
            return a * b;
        }
        //定义除法方法
        public float div() {
            return a / b;
        }

        //
        void four() {

        }
    }
}
