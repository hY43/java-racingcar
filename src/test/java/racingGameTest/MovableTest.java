package racingGameTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingGame.domain.FixedMovable;
import racingGame.domain.Movable;
import stringCalculator.domain.CalculateInfo;

class MovableTest {
	Movable movable;
	
	@Test
	@DisplayName("�̵� ���� ���� �׽�Ʈ(false)")
	public void immovableTest() {
		movable = new FixedMovable(3);
		assertThat(movable.checkMovable()).isEqualTo(false);
	}

	@Test
	@DisplayName("�̵� ���� ���� �׽�Ʈ(false)")
	public void movableTest() {
		movable = new FixedMovable(4);
		assertThat(movable.checkMovable()).isEqualTo(true);
	}
}
