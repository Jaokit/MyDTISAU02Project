package com.dti.controlflow;

//CF กลุ่ม Loop การทำงานซ้ำ
//while, do-while, for
public class km02CF {

    public static void main(String[] args) {
        //while
        int a = 1;

        while (a <= 5) {
            System.out.println("Hello");
            a = a + 1; //a++, ++a, a+=1
        }

        //do-while
        int b = 1;

        do {
            System.out.println("Hi");
            b = b + 1; //b++, ++b, a=1
        } while (b <= 5);

        //for
        for (int c = 1; c <= 5; c = c + 1) {
            System.out.println("Hey");
        }
    }
}
