import java.util.*;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("你叫什么？");
        String name = in.nextLine();

        System.out.println("你好," + name);
    }
}
