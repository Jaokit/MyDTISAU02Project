package com.sau.workshop;

import java.util.Scanner;

//ป้อนตัวเลข 2 จำนวนทางแป้นพิมพ์ แล้วแสดงผลรวมทางหน้าจอ
//ทั้งนี้หากผลรวมยังไม่เกิน 500 ให้วนป้อนตัวเลข 2 จำนวน แล้วแสดงผลไปเรื่อยๆ
public class WorkshopCF02 {

    public static void main(String[] args) {

        double n1, n2, sum;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number 1 : ");
            n1 = sc.nextDouble();
            System.out.print("Enter number 2 : ");
            n2 = sc.nextDouble();
            sum = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + sum);
        } while (sum <= 500);
    }
}
