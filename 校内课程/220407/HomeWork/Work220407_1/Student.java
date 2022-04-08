package Work220407_1;

public class Student {
    String name;
    double score;

    //无参构造方法
    public Student() {
    }

    //有参构造方法
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    //设值方法
    void stuSetInfo(String name, double score)
    {
        this.name = name;
        this.score = score;
    }

    //获值方法
    void stuGetInfo()
    {
        System.out.println("姓名:" + name + "\n年龄:" + score);
    }
}
