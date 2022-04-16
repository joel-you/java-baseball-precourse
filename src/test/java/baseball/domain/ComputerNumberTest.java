package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerNumberTest {
    private ComputerNumber computerNumber;

    @BeforeEach
    protected final void init() {
        computerNumber = new ComputerNumber();
    }

    @Test
    void 컴퓨터_숫자_중복값_테스트() {
        computerNumber.setNumber();
        List<Integer> testList = computerNumber.getNumber();

        for (int i = 0; i< testList.size(); i++) {
            assertThat(Collections.frequency(testList, testList.get(i))).isEqualTo(1);
        }

    }
}