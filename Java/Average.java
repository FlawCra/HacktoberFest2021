package Java;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		List<BigDecimal> numbersList = new LinkedList<>();

		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Enter the quantity of numbers: ");
			
			int quantity = in.nextInt();

			for (int i = 1; i <= quantity; i++) {
				System.out.print("\nEnter the value of number: " + i + ": ");
				numbersList.add(in.nextBigDecimal());
			}

			BigDecimal total = numbersList.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

			BigDecimal average = total.divide(new BigDecimal(quantity), new MathContext(quantity));

			System.out.println("\nThe average is: " + average);
		} finally {
			in.close();
		}
	}
}