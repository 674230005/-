package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        int [] numbers = {1, 15, 20, 25, 9, 8, 14, 25, 22, 41, 26, 24, 38, 18, 17, 36, 41, 21,};

        
        int countOdd = 0;
        int countEven = 0;

        for (int i=0; i < numbers.length; i++){
            System.out.print(numbers [i]+" " );
           if(numbers[i] % 2 == 0){
             countEven++;
           }else{
              countOdd++;
           }
           
           
           
            
        }  
        System.out.println("\n Amount of all Number : "+  numbers.length);
            System.out.println(" Amount of Odd Number : "+  countOdd);
            System.out.println(" Amount of Even Number : "+  countEven);

}
}