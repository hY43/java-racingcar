package stringCalculator;

import java.util.Scanner;

public class StringCalculatorMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �Է��ϼ��� : ");
		
		StringCalculator calculator = new StringCalculator();
		int result = calculator.calculate(scanner.nextLine());
		
		System.out.println("���� ����� " + result + "�Դϴ�.");
	}
}
