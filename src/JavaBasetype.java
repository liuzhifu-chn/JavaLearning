/**
 * java变量和数据类型
 * 定义变量时，要遵循作用域最小化原则，尽量将变量定义在尽可能小的作用域，并且，不要重复使用变量名。
 * Java提供了两种变量类型：基本类型和引用类型
 * 基本类型包括整型，浮点型，布尔型，字符型。
 */

public class JavaBasetype {
    public static void main(String[] args) {
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println("i:" + i);
        System.out.println("i2:" + i2);
        System.out.println("i3:" + i3);
        System.out.println("i4:" + i4);
        System.out.println("i5:" + i5);
        System.out.println("l:" + l);

        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println("f1:" + f1);
        System.out.println("f2:" + f2);
        System.out.println("d:" + d);
        System.out.println("d2:" + d2);
        System.out.println("d3:" + d3);

        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
        System.out.println("b1:" + b1);
        System.out.println("b2:" + b2);
        System.out.println("isGreater:" + isGreater);
        System.out.println("inAdult:" + isAdult);

        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);

        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
        System.out.println("圆的面积为：" + area);

        //省略变量类型，使用var,编译器自动判断
        var name = new String("JEFF");
        System.out.println(name);

        String longStr = """
                第一行
                第二行
              第三行
                """;
        System.out.println(longStr);
    }
}
