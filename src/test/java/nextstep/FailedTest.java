package nextstep;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailedTest {

    @Test
    void name() {
            Assertions.assertThat(1).isEqualTo(2);
    }
}
