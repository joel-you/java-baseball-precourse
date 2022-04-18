package baseball.domain;

import java.util.List;

import static baseball.core.Constant.*;

public class GameStatus {
    private int strike;

    private int ball;

    public GameStatus(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public GameStatus() {
        this.strike = 0;
        this.ball = 0;
    }

    public GameStatus isGameStatus(ComputerNumber computerNumber, UserNumber userNumber) {
        for (int i=0; i<computerNumber.getNumber().size(); i++) {
            isCompare(userNumber.getNumber(), i, computerNumber.getNumber().get(i));
        }
        return new GameStatus(this.strike, this.ball);
    }

    private void isCompare(List<Integer> userNumber, int i, Integer compareNumber) {
        if(!isStrike(userNumber, i, compareNumber)) {
            isBall(userNumber, compareNumber);
        }
    }

    private boolean isStrike(List<Integer> userNumber, int i, Integer value) {
        if (userNumber.get(i).equals(value)) {
            strike++;
            return true;
        }
        return false;
    }

    private void isBall(List<Integer> userNumber, Integer value) {
        if (userNumber.contains(value)) {
            ball++;
        }
    }

    private boolean isNothing() {
        return this.strike == 0 && this.ball == 0;
    }

    public String getResult() {
        StringBuilder sb = new StringBuilder();
        if (isNothing()) {
            sb.append(NOT_THING);
        }

        if (this.ball != 0) {
            sb.append(this.ball + BALL);
        }

        if (this.strike != 0) {
            sb.append(this.strike + STRIKE);
        }
        return sb.toString();
    }

    public boolean isWin() {
        return this.strike == 3;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
