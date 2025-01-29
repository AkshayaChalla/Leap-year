import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int Year = sc.nextInt();
        if( (Year%4 == 0 && Year %100 != 0) || (Year %400 ==0) ){
            System.out.println("It IS A LEAP YEAR");
        }else{
            System.out.println("IT IS NOT A LEAP YEAR");
        }
        sc.close();
    }
    
}
