package code;

import java.util.Random;
import java.util.Scanner;

public class CodeText3 {
    public static void main(String[] args) {
        //猜数字游戏
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入猜的数字：");
            int temp = sc.nextInt();
            if (temp > num) {
                System.out.println("大了");
            } else if (temp < num) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你猜对了！");
                break;
            }
        }
    }
}
