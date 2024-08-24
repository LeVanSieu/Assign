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
public class bai3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap 1 so x: ");
        int place = nhap.nextInt();
        if(place == 1) {
            System.out.println("Gold medal");
        } else if (place == 2) {
            System.out.println("Silver medal");
        } else if (place == 3){
            System.out.println("Bronze medal");
        }
    }
}
