
package lesson4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap 1 so x: ");
        int x = nhap.nextInt();
        if(x>0){
            System.out.println("Positive");
        }
          else if (x<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
