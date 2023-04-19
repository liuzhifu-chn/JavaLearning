import java.util.Arrays;

public class ArrayTrainning {

    public static void main(String[] args) {
        int ns[] = {10, 5, 1, 50, 30};
        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }

        //for each 循环方式
        for (int n : ns) {
            System.out.println(n);
        }

        //使用arrays中的toString方法
        System.out.println(Arrays.toString(ns));

        //排序
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }
}
