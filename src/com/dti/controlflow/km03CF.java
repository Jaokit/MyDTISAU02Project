package com.dti.controlflow;

//คำสั่ง break; และ continue;
//break ในลูปทำงานเมื่อไร จบลูปทันที
//continue ในลูปทำงานเมื่อไร จบรอบนั้นแล้วไปรอบใหม่ทันที
public class km03CF {

    public static void main(String[] args) {
        for (int c = 1; c <= 5; c = c + 1) {

            if (c == 3) {
                break;
            }
            System.out.println(c + "__Hey");
        }
        for (int c = 1; c <= 5; c = c + 1) {

            if (c == 3) {
                continue;
            }
            System.out.println(c + "__Hum");
        }
    }
}
