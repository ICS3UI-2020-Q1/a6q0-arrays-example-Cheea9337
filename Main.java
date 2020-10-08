import java.util.Scanner;
/**
 * calculate the average of 5 grades
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // cretae an array to store the grades
    double[] grades = new double[5];

    // use a for loop to get all the grades from the user
    for(int i = 0; i < grades.length; i++){
      // ask the user for a grades
      System.out.println("Enter Mark " + (i+1));
      // fill the array with a value
      grades[i] = input.nextDouble();
    }

    // create a variable to store the total of all grades
    double total = 0;
    // use the for loop to add each value to total
    for(int i = 0; i < grades.length; i++){
      // add each grade into total
      total = total + grades[i];
    }

    // calculate the average
    double average = total/grades.length;

    // let the user know the average
    System.out.println("Your average mark is " + average);
    
  }
}
