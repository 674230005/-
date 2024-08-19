//ตรวจสอบคำนาหน้าชื่อ
//นาย นาง นางสาว
//ถ้าเป็น ด.ญ. หรือนางสาว ให้แดสงข้อความว่า "ผู้หญิง"
//ถ้าเป็น ด.ช. หรือนาย ให้แดสงข้อความว่า "ผู้ชาย"
//อายุ
//

//เพศ อายุ สถานะสมรส
package W10;
import java.util.Scanner;
public class W10_04_titleStatus{
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    System.out.print("ระบุเพศ:malr/feamle ");
        String gender = kb.next();
    
    System.out.print("ระบุอายุ:");
        int age = kb.nextInt();
    
    System.out.print("ระบุสถานนะสมรส:");
        String isMarried = kb.next();    
    
    if(gender.equalsIgnoreCase("male")){
        // ถ้าเป็นผู้ชาย => ด.ช. นาย
        if(age < 15){
             System.out.println("ด.ช.");
        }else{
             System.out.println("นาย");
        }
    }else{
        //ถ้าเป็นผู้หญิง => ด.ญ นาง นางสาว
        if(age < 15){
             System.out.println("ด.ญ.");
        }else if(isMarried.equalsIgnoreCase("married")){;
             System.out.println("นาง");
        }else{
            System.out.println("นางสาว");
        }
    }
  }
}
