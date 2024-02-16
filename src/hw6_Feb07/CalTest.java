package hw6_Feb07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator test = new Calculator();

        
        for (;;) {
            try {
                System.out.println("請輸入X的值");
                int x = sc.nextInt();

                System.out.println("請輸入Y的值");
                int y = sc.nextInt();

                test.powerXY(x, y);
                break;
            } catch (CalException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("輸入格式不正確");
                sc.nextLine();
                
            }
        }

      
    }
}


