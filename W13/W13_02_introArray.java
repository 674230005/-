package W13;
import java.util.Scanner;
public class W13_02_introArray {
    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด Array แบบที่2 ไม่รู้จำนวนข้อมูลล่วงหน้า
        String [] brandsCars = new String[3];

        Scanner kb = new Scanner(System.in);

        //กำหนดค่าให้กับarray
        brandsCars[0] = "Toyota";
        brandsCars[1] = "Honda";
        brandsCars[2] = "Nissan";

        //แสดงผลลัพย์loop
        System.out.println("\nBrand of cars in the array are");
        for( int i= 0; i < brandsCars.length  ; i++ ){
            System.out.println(brandsCars[i] + " / ");
    }
    //แก้ไขคำใน Array โดยรับค่าจากคีย์บอร์ด
    System.out.println("\n\nPlease enter the beand of the 3 rd car");
    for (int i=0; i < brandsCars.length  ; i++ ){
        System.out.println("Enter brand " + (i+1) + "; ");
        brandsCars[i] = kb.next();

    }
        System.out.println("\nNew Brand of cars in the array are");
        for(String car : brandsCars ){  //ใช่for-each
            System.out.println(car + " / ");
        }
}
}