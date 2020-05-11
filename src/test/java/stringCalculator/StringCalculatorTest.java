package stringCalculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }
    
	@Test
	@DisplayName("���ڿ� �ܼ� ��� �׽�Ʈ")
	void stringSimpleCalculateTest() {
		assertThat(stringCalculator.calculate("1 + 2")).isEqualTo(3);
		assertThat(stringCalculator.calculate("2 - 1")).isEqualTo(1);
		assertThat(stringCalculator.calculate("3 * 2")).isEqualTo(6);
		assertThat(stringCalculator.calculate("4 / 2")).isEqualTo(2);
	}

	@Test
	@DisplayName("���ڿ� ���� ��� �׽�Ʈ")
	void stringComplexCalculateTest() {
		assertThat(stringCalculator.calculate("1 + 2 * 3 - 1 / 4")).isEqualTo(2);
	}
}
