package com.dti.controlflow;

//control Flow กลุ่ม Selection/Condition การเลือกทำ
public class km01CF {

    public static void main(String[] args) {
        //แบบที่ 1 พิสูจน์ครั้งเดียว จริงทำ เท็จไม่ทำ : if
        int a = 20;
        if (a > 5) {
            System.out.println("Hello...");
        }
        System.out.println("---------------------------------------");
        //แบบที่ 2 พิสูจน์ครั้งเดียว จริงทำอย่าง เท็จทำอย่าง : if-else
        int b = 100;
        if (b < 80) {
            System.out.println("Wow...");
        } else {
            System.out.println("Woo...");
        }
        System.out.println("---------------------------------------");
        //แบบที่ 3 พิสูจน์หลายครั้ง : if-else-if , switch-case(พิสูจน์ว่าเท่ากันหรือไม่เท่านั้น *เฉพาะตัวเลข หรือ ตัวอักษร *ตรงกับเคสไหนจะทำเรื่อยๆจนเจอ break)
        int c = 70;
        if (c > 80) {
            System.out.println("111");
        } else if (c > 70) {
            System.out.println("222");
        } else if (c > 60) {
            System.out.println("333");
        } else { //ไม่ต้องมี if ขึ้นอยู่กับโจทย์
            System.out.println("5555555555");
        }
        System.out.println("---------------------------------------");
        int busNumber = 84;
        switch (busNumber) {
            case 80:
                System.out.println("ไปสนามหลวง");
                break;
            case 57:
                System.out.println("ไปพาต้า");
                break;
            case 84:
                System.out.println("ไปวัดไร่ขิง");
                break;
            case 81:
                System.out.println("ไปศิริราช");
                break;
            default:
                System.out.println("ยังไม่มีข้อมูล TT");
        }
    }
}
