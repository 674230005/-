package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

    int score;      // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน
    // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
    do {
            System.out.println("Enter your score between 1 and 100:");
            score = kb.nextInt();// รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร score
        } while (score<1 || score>100);   // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
            
        
        // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75

        // ตรวจสอบเกรด
        if (score >=101){

            System.out.println("Please enter a value between 0 and 100");
    
            }else if (score <=0){
                System.out.println("Please enter a value between 0 and 100");
            }else if (score <=49){
                System.out.println("เกรดที่ได้ E ");
            }else if (score <=59){
                System.out.println("เกรดที่ได้ D ");
            }else if (score <=69){
                System.out.println("เกรดที่ได้ C ");
            }else if (score <=79){
                System.out.println("เกรดที่ได้ B ");
            }else{
                System.out.println("เกรดที่ได้ A ");  
            }
        kb.close(); // ปิด Scanner object
    }
}
       
