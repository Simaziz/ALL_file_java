import java.util.Scanner;
public class ex {
    
     static void main(String[] args){
        // decalare 
        int number;
        Scanner input = new Scanner(System.in);

        do{
            // ask user for enter number
            System.out.print("Enter the number : ");
            int number = input.nextInt();
        }while(number<=5);
        System.out.println("The last number your entered is " + number);
        input.close();
    }
    
}
