package W13;
public class W13_01_introArray {
    public static void main(String[] args) {
    // ประกาศตัวแปรชนิด Array แบบที่1 รู้จำนวนข้อมูลล่วงหน้า
        String [] colors = {"Purple", "cyan", "Blue", "Green", "Yellow", "Orange.", "Red",};
        int [] banks = {20, 50, 100, 500, 1000,};
        char [] alphabts = {'A', 'B', 'C', 'D', 'E',};
        //แสดงผลลับโดยใช้ index ของ Array
        System.out.println("The first color is" + colors[0]);
        System.out.println("The Thire alphabts is" + alphabts[2]);

        //แสดงผลโดยใช้ Loop
        System.out.println("color in the array are ");
        for( int i=0; i < 7  ; i++ ){
            System.out.print(colors[i] + " ");
        
        }
        System.out.println();
        System.out.println("=============================================");
        for( int i=6; i > 0  ; i-- ){
            System.out.print(colors[i] + " ");
    
        }
    System.out.println();
    System.out.println("=============================================");
    System.out.println("Banks in the array are");
        for( int i=0; i < banks.length  ; i++ ){ // ใช้จุด .length ในการหาขนาดของ Array
            System.out.print(banks[i] + " ");
    }
  }
}