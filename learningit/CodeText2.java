package code;

import java.util.Scanner;

public class CodeText2 {
    public static void main(String[] args) {
        //求质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();

        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                //System.out.println(num + "不是质数");
                break;
            }
        }
        if (flag) {
            System.out.println(num + "是质数");
        } else {
            System.out.println(num + "不是质数");
        }

        //简化思路

    }
}
