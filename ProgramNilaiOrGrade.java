public class grade {

   public static void main(String args[]) {

      char grade = 'A';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
            System.out.println("Good Job!");
            break;
         case 'C' :
            System.out.println("Study Harder!");
            break;
         case 'D' :
            System.out.println("Sorry, you failed!");
         case 'F' :
            System.out.println("Sorry, you failed!");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}