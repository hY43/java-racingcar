package racingGameMain.view;

import java.util.Scanner;

import racingGameMain.utils.StringUtils;

public class InputView {
	public static int inputCountOfCars(Scanner sc) {
		System.out.println("�ڵ����� ����� �� �� �ΰ���?");
		return StringUtils.parseInt(sc.nextLine());
	}
	
	public static int inputCountOfGames(Scanner sc) {
		System.out.println("�õ��� Ƚ���� �� ȸ �ΰ���");
		return  StringUtils.parseInt(sc.nextLine());
	}
}
