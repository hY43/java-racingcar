package util;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidationUtilsTest {

	@DisplayName("�Է� �� ���� ����")
	@ParameterizedTest
	@ValueSource(strings = {""})
	public void isEmptyTest(String inputValue) {
		assertThatThrownBy(() -> {
			ValidationUtils.isEmpty(inputValue);
		}).isInstanceOf(IllegalArgumentException.class)
		  .hasMessageContaining("������ �Է� �Ǿ����ϴ�. �Է� ���� Ȯ�����ּ���." );
	}
	
	@DisplayName("������ ����")
	@ParameterizedTest
	@ValueSource(strings = {"@", "$"})
	public void isOperatorTest(String inputValue) {
		assertThatThrownBy(() -> {
			ValidationUtils.isOperator(inputValue);
		}).isInstanceOf(IllegalArgumentException.class)
		  .hasMessageContaining("�����ڰ� �ƴ� ��ȣ�� �ԷµǾ����ϴ�. �Է� ���� Ȯ�����ּ���." );
	}
}
