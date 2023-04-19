/**
 * 输入输出练习
 * Java提供的输出包括：System.out.println() / print() / printf()，其中printf()可以格式化输出；
 * Java提供Scanner对象来方便输入，读取对应的类型可以使用：scanner.nextLine() / nextInt() / nextDouble() / ...
 * 常见格式化
 * %d	格式化输出整数
 * %x	格式化输出十六进制整数
 * %f	格式化输出浮点数
 * %e	格式化输出科学计数法表示的浮点数
 * %s	格式化字符串
 */

import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出

        String str1 = "abc";
        String str2 = "cde";
        if (str1 != null && str1.equals(str2)) //为了避免str1为null引起NullPointerException错误，用&&运算符的短路特性。
            System.out.println("两个字符串一样");
        else
            System.out.println("两个字符串不一样");

        //从Java 12开始，switch语句升级为更简洁的表达式语法，使用类似模式匹配（Pattern Matching）的方法，保证只有一种路径会被执行，并且不需要break语句
        //注意新语法使用->，如果有多条语句，需要用{}括起来。不要写break语句，因为新语法只会执行匹配的语句，没有穿透效应。
        //很多时候，我们还可能用switch语句给某个变量赋值。
        String fruit = "apple";
        switch (fruit) {
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            case "mango" -> {
                System.out.println("Selected mango");
                System.out.println("Good choice!");
            }
            default -> System.out.println("No fruit selected");
        }

        int opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        }; // 注意赋值语句要以;结束
        System.out.println("opt = " + opt);

        //从Java 14开始，switch语句正式升级为表达式，不再需要break，并且允许使用yield返回值。
        fruit = "orange";
        opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch语句返回值
            }
        };
        System.out.println("opt = " + opt);

        //for each 新写法。除了数组外，for each循环能够遍历所有“可迭代”的数据类型，包括List、Map等
        int[] ns = {1, 4, 9, 16, 25};
        for (int n : ns) {
            System.out.println(n);
        }
    }
}
