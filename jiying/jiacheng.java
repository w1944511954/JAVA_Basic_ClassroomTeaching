package jiying;

import java.util.Scanner;//输入头文件

//输入两个数字，输出它们相加，相乘的结果。
public class jiacheng {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();   //调用in的nextInt函数来读入整型
        int b = in.nextInt();
        System.out.println("相乘的结果是" + (a + b));
        System.out.println("相加的结果是" + (a * b));
    }
}