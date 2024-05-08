import java.util.Scanner;
public class pratice{
    public static void main(String[] args ){
        // create object scanner
        Scanner Input = new Scanner(System.in);

        // create variable 
        int positiveCount =0;
        int negativeCount =0;
        int totalCount =0;
        int sum =0;

        

        while(true){
            System.out.println("Enter integers (Enter 0 to end ) ");
            int num=Input.nextInt();

            if(num==0){
                break;
            }
            else if (num >0){
                positiveCount++;
                
            }
            else{
                negativeCount++;
            }

            if(num !=0){
                sum +=num;
                totalCount +=num;
            }
            
        }
        if(totalCount>0){
                double average = (double ) sum / totalCount;
                System.out.println("Total number positive number integer : "+positiveCount);
                System.out.println("Total number negative number interger : " +negativeCount);
                System.out.println("total"+sum);
                System.out.println("Average "+average);
            }
            else{
                System.out.println("no valid integer entered ");
            }
            Input.close();
            
    }
}