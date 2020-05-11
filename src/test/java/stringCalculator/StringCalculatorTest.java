package stringCalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import domain.StringCalculator;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }
    
	@Test
	@DisplayName("���ڿ� �ܼ� ��� �׽�Ʈ")
	void stringSimpleCalculateTest() {
		assertThat(stringCalculator.stringCalculate("1 + 2")).isEqualTo(3);
		assertThat(stringCalculator.stringCalculate("2 - 1")).isEqualTo(1);
		assertThat(stringCalculator.stringCalculate("3 * 2")).isEqualTo(6);
		assertThat(stringCalculator.stringCalculate("4 / 2")).isEqualTo(2);
	}

	@Test
	@DisplayName("���ڿ� ���� ��� �׽�Ʈ")
	void stringComplexCalculateTest() {
		assertThat(stringCalculator.stringCalculate("1 + 2 * 3 - 1 / 4")).isEqualTo(2);
	}
}
