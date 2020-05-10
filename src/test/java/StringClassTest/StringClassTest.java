package StringClassTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class StringClassTest {

	@Test
	void splitStringArrayHavingTwoNumber() {
		// �䱸���� 1-1 : "1,2"�� ,�� split ���� �� 1�� 2�� �� �и��Ǵ��� Ȯ���ϴ� �н� �׽�Ʈ�� �����Ѵ�.
		String[] result = "1,2".split(",");
		assertThat(result).containsExactly("1", "2");
	}

	@Test
	void splitStringArrayHavingOneNumber() {
		// �䱸���� 1-2 : "1"�� ,�� split ���� �� 1���� �����ϴ� �迭�� ��ȯ�Ǵ����� ���� �н� �׽�Ʈ�� �����Ѵ�.
		String[] result = "1".split(",");
		assertThat(result).containsExactly("1");
	}

	@Test
	void subStringRemoveParenthesis() {
		// �䱸���� 2 : "(1,2)" ���� �־����� �� String�� substring() �޼ҵ带 Ȱ���� ()�� �����ϰ� "1,2"�� ��ȯ�ϵ���
		// �����Ѵ�.
		String targetString = "(1,2)";
		assertThat(targetString.substring(targetString.indexOf("(") + 1, targetString.indexOf(")"))).isEqualTo("1,2");
		;
	}

	@Test
	void charAtTest() {
		// �䱸���� 3-1 : "abc" ���� �־����� �� String�� charAt() �޼ҵ带 Ȱ���� Ư�� ��ġ�� ���ڸ� �������� �н� �׽�Ʈ��
		// �����Ѵ�.
		String targetString = "abc";
		assertThat(targetString.charAt(0)).isEqualTo('a');
		assertThat(targetString.charAt(1)).isEqualTo('b');
		assertThat(targetString.charAt(2)).isEqualTo('c');
	}

	@Test
	void charAtExceptionTest() {
		// �䱸���� 3-2 : String�� charAt() �޼ҵ带 Ȱ���� Ư�� ��ġ�� ���ڸ� ������ �� ��ġ ���� �����
		// StringIndexOutOfBoundsException�� �߻��ϴ� �κп� ���� �н� �׽�Ʈ�� �����Ѵ�.
		int targetIndex = 5;
		String targetString = "abc";

		assertThatThrownBy(() -> {
			assertThat(targetString.charAt(targetIndex)).isEqualTo('a');
		}).isInstanceOf(StringIndexOutOfBoundsException.class)
		  .hasMessageContaining("String index out of range: " + targetIndex);
	}
}
