package setCollectionTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
    
    @Test
    @DisplayName("�䱸���� 1 : size �޼ҵ带 Ȱ���� Set Collection�� ������ Ȯ�� �׽�Ʈ")
    void setCollectionSizeTest() {
    	assertThat(numbers.size()).isEqualTo(3);
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    @DisplayName("�䱸���� 2 : jUnit ParameterizedTest�� Ȱ���� Set (only true)")
    void setCollectionContainsTest(int inputValue) {
    	assertThat(numbers.contains(inputValue)).isTrue();
    }
    
    @ParameterizedTest
    @CsvSource({"1,true", "2,true", "4,false", "3,true"})
    @DisplayName("�䱸���� 3 : jUnit ParameterizedTest�� Ȱ���� Set (mix)")
    void setCollectionContainsTest(int inputValue, boolean expectedValue) {
    	assertThat(numbers.contains(inputValue)).isEqualTo(expectedValue);
    }
}
