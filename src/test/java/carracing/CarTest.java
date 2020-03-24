package carracing;

import carracing.model.Car;
import java.util.List;
import org.junit.jupiter.api.Test;

import static carracing.model.Car.INITIAL_POSITION;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
  private static final int INITIAL_ROUND = 0;
  private static final int TOTAL_ROUND = 10;
  private static final int MOVED_ONCE = 1;

  @Test
  public void moveTest() {
    Car car = new Car();

    for (int currentRound = INITIAL_ROUND; currentRound < TOTAL_ROUND;) {
      car.move();
      List<Integer> positions = car.getPositions();
      Integer beforePosition = positions.get(currentRound);
      Integer afterPosition = positions.get(++currentRound);
      assertThat(afterPosition).isBetween(beforePosition, beforePosition + MOVED_ONCE);
    }
  }

  @Test
  public void moveIfTest() {
    Car car = new Car();
    Integer currentRound = INITIAL_ROUND;
    car.moveIf(false);
    assertThat(car.getPositions().get(++currentRound)).isEqualTo(INITIAL_POSITION);
    car.moveIf(true);
    assertThat(car.getPositions().get(++currentRound)).isEqualTo(INITIAL_POSITION + MOVED_ONCE);
  }
}
