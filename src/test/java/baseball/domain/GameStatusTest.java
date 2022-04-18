package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GameStatusTest {
    private GameStatus gameStatus;

    @BeforeEach
    protected final void init() {
        gameStatus = new GameStatus();
    }

    @ParameterizedTest
    @MethodSource("providerParam")
    void 게임결과_테스트(List<Integer> computerNumber, List<Integer> userNumber) {
        gameStatus.isGameStatus(computerNumber, userNumber);

        assertThat(gameStatus.getResult()).isEqualTo("2볼");
    }

    @ParameterizedTest
    @MethodSource("providerParam")
    void 스트라이크_테스트(List<Integer> computerNumber, List<Integer> userNumber) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method strikeMethod = gameStatus.getClass().getDeclaredMethod("isStrike", List.class, int.class, Integer.class);
        strikeMethod.setAccessible(true);
        strikeMethod.invoke(gameStatus, userNumber, 0, 2);

        assertThat(gameStatus.getStrike()).isEqualTo(1);
    }

    @ParameterizedTest
    @MethodSource("providerParam")
    void 볼_테스트(List<Integer> computerNumber, List<Integer> userNumber) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method ballMethod = gameStatus.getClass().getDeclaredMethod("isBall", List.class, Integer.class);
        ballMethod.setAccessible(true);
        ballMethod.invoke(gameStatus, userNumber, 2);

        assertThat(gameStatus.getBall()).isEqualTo(1);
    }

    @Test
    void 낫싱_테스트() {

    }

    static Stream<Arguments> providerParam() {
        return Stream.of(
                Arguments.of(
                        Arrays.asList(
                                new Integer(1),
                                new Integer(2),
                                new Integer(3)
                        ),
                        Arrays.asList(
                                new Integer(2),
                                new Integer(3),
                                new Integer(4)
                        )
                )
        );
    }

}