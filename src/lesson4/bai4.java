/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class bai4 {
    public static void main(String[] args) {
        System.out.println("Ta co bieu thuc ax+b=0 ");
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = nhap.nextInt();
        System.out.println("Nhap so b: ");
        int b = nhap.nextInt();
        System.out.println(a+"x+"+b+"=0");
        if(a==0) {
            if (b==0) {
                System.out.println("Phuong tirnh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
             int x=-b/a;
             System.out.println("x co gia tri la: "+x);
        }
    }
}
