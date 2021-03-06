package movie;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import movie.discountpolicy.AmountDiscountPolicy;
import movie.discountpolicy.NoneDiscountPolicy;
import movie.discountpolicy.PercentDiscountPolicy;
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

  @Test
  @DisplayName("할인 정책 변경")
  void changeDiscountPolicy() {
    // given
    Money fee = Money.wons(10000);
    Movie avatar = new Movie("아바타",
        Duration.ofMinutes(120),
        fee,
        new AmountDiscountPolicy(Money.wons(800)));
    PercentDiscountPolicy percentDiscountPolicy = new PercentDiscountPolicy(0.1);

    // when
    avatar.changeDiscountPolicy(percentDiscountPolicy);

    // then
    assertThat(avatar.getDiscountPolicy()).isEqualTo(percentDiscountPolicy);
  }
}
