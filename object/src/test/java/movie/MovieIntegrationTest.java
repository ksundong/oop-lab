package movie;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import movie.discountpolicy.NoneDiscountPolicy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MovieIntegrationTest {

  @Test
  @DisplayName("할인 되지 않는 영화 생성")
  void createNoneDiscountMovie() {
    // given
    // when
    Movie starWars = new Movie("스타워즈",
        Duration.ofMinutes(210),
        Money.wons(10000),
        new NoneDiscountPolicy());

    // then
    assertThat(starWars.getFee()).isEqualTo(Money.wons(10000));
  }
}
