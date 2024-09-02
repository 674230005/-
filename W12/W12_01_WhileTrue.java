package W12;

public class W12_01_WhileTrue {
    public static void main(String[] args) {

    int i = 1;        // กำหนดค่าเริ่มต้น
    while(true){      // เพิ่มค่า1ทีละ1
          i++; 
          System.out.print(i+" ");  // แสดงค่า1
        if(i>1000)  {
            break;                 //ออกจากลูป
        }      
      }
    }
}
