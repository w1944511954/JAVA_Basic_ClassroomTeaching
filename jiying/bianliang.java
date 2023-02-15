package jiying;

import java.util.Scanner;

//100-数字=？
public class bianliang {
    public static void main(String[] args) {
        System.out.println("请输入两个数字让它们相减");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
    }
}