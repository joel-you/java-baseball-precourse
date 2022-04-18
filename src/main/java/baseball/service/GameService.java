package baseball.service;

import baseball.domain.ComputerNumber;
import baseball.domain.GameStatus;
import baseball.domain.UserNumber;
import baseball.ui.GameView;

public class GameService {
    private GameView gameView;
    private boolean isInning = true;

    public GameService() {
        this.gameView = new GameView();
    }

    public void playGame() {
        ComputerNumber computerNumber = new ComputerNumber();
        computerNumber.setNumber();

        UserNumber userNumber;
        while (isInning) {
            userNumber = new UserNumber();
            userNumber.setNumber(gameView.numberInputPrompt());
            isJudge(new GameStatus().isGameStatus(computerNumber, userNumber));
        }
    }

    public void isJudge(GameStatus gameStatus) {
        String gameResult = gameStatus.getResult();
        gameView.displayResults(gameResult);

        if (gameStatus.isWin()) {
            gameView.displayWin();
            isInning = false;
        }
    }

    public boolean isRestart() {
        if (gameView.restartInputPrompt().equals("1")) {
            return true;
        }
        return false;
    }
}
