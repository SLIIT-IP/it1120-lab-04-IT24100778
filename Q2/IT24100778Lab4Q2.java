import java.util.Scanner;
public class IT24100778Lab4Q2 {
    public static void main(String[]args){

    int exam,lab,exam1,lab1,sum1,sum2;
    boolean sum;
    double total;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Pleas enter exam marks (out of 100): ");
    exam = scanner.nextInt();
    if (exam>=0 && exam<=100) {
    }

    else {
       System.out.println("Invalid input for exam marks. Treminating program");
       scanner.nextInt();
    }

    System.out.println("Please enter lab submission marks (out of 100):");
    lab = scanner.nextInt();
    if (lab>0 && lab<=100) {
    }
    else{
       System.out.println("Invalid input for exam marks. Terminating program ");
       scanner.nextInt();
    }

    System.out.println("Please enter the percentage given for the exam: ");
    exam1 = scanner.nextInt();

    System.out.println("Please enter the percentage given for the lab submission: ");
    lab1 = scanner.nextInt();

    if (sum = (exam1+lab1==100)) {
    }
   else {
     System.out.println("The percentage must add up to 100. Terminating programe");
     scanner.nextInt(); 
   }
   sum1 = exam*exam1/100;
   sum2 = lab*lab1/100;
   total = sum1+sum2;
   System.out.println("Final exam mark is: "+total);
  }
}
   
   
    
    
