package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

class UserNumberTest {
    private UserNumber userNumber;

    @BeforeEach
    protected final void init() {
        userNumber = new UserNumber();
    }

    @Test
    void 잘못된_입력_3자리초과_테스트() {
        final String inputStr = "1123";
        assertThatIllegalArgumentException().isThrownBy(() -> {
            userNumber.setNumber(inputStr);
        });
    }

    @Test
    void 잘못된_입력_숫자아님_테스트() {
        final String inputStr = "한글";
        assertThatIllegalArgumentException().isThrownBy(() -> {
            userNumber.setNumber(inputStr);
        });
    }

}