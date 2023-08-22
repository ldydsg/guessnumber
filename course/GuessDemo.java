package hrb.course;

import java.util.Random;
import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int LuckNumber=r.nextInt(100)+1;
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("请输入您猜测的数据：");
            int guessNumber=sc.nextInt();66
            if (guessNumber>LuckNumber){
                System.out.println("数字大喽");
            }else if (guessNumber<LuckNumber){
                System.out.println("数字小咯~");
            }else {
                System.out.println("恭喜你，对了！");
                break;
            }
        }
    }
}
