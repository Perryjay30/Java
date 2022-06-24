import java.util.Scanner;

public class AverageAcceleration{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		double startingVelocity = sc.nextDouble();
		double endingVelocity = sc.nextDouble();
		double time = sc.nextDouble();
		double averageAcceleration = (endingVelocity - startingVelocity) / time;
		System.out.printf("The average acceleration is %.4f", averageAcceleration);
	}
}