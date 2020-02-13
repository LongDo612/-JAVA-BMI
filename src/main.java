import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        double bmi = weight/Math.pow(height,2);

        if (bmi<18.5){
            System.out.println("Your BMI is: " +bmi +" . You are underweight.");
        }
        else if (bmi < 25.0){
            System.out.println("Your BMI is: " +bmi+ " . You are normal.");
        }
        else if (bmi <30.0){
            System.out.println("Your BMI is: "+bmi+ " . You are Overweight.");
        }
        else {
            System.out.println("Your BMI is: "+bmi+ " . You are fucking fat fuck.");
        }
    }
}
