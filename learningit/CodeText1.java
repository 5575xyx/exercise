package code;

import java.util.Scanner;

public class CodeText1 {
    public static void main(String[] args) {
        //求平方根
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数：");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i * i == num) {
                System.out.println(i + "就是" + num + "的平方根");
                break;
            } else if (i * i > num) {
                System.out.println((i - 1) + "就是" + num + "的平方根的整数部分");
                break;
            }
        }
    }
}
