package stringCalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dto.CalculateInfo;

class CalculatorTest {

	@Test
	@DisplayName("���� ��� ���� �׽�Ʈ")
	public void add() {
		assertThat(new CalculateInfo(1,2,"+").calculate()).isEqualTo(3);
	}

	@Test
	@DisplayName("���� ��� ���� �׽�Ʈ")
	public void subtract() {
		assertThat(new CalculateInfo(2,1,"-").calculate()).isEqualTo(1);
	}
	
	@Test
	@DisplayName("���� ��� ���� �׽�Ʈ")
	public void multiply() {
		assertThat(new CalculateInfo(2,3,"*").calculate()).isEqualTo(6);
	}
	
	@Test
	@DisplayName("������ ��� ���� �׽�Ʈ")
	public void divide() {
		assertThat(new CalculateInfo(4,2,"/").calculate()).isEqualTo(2);
	}
}
