package Work220407_1;

public class Test {
    public static void main(String[] args) {
        Student stuWithOut = new Student(); //调用无参构造方法
        stuWithOut.stuSetInfo("张三",98.5); //利用"stuSetInfo"赋值
        stuWithOut.stuGetInfo(); //利用"stuGetInfo"打印学生信息

        System.out.println("\n**** 分隔符 ****\n");

        Student stuWith = new Student("李四",94.5); //调用有参构造方法
        stuWith.stuGetInfo(); //利用"stuGetInfo"打印学生信息
    }
}
