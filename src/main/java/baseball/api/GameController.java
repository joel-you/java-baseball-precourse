package baseball.api;

import baseball.service.GameService;

public class GameController {
    private GameService gameService;

    private boolean isRestart = true;

    public void run() {
        while (isRestart) {
            gameService = new GameService();
            gameService.playGame();
            isRestart();
        }
    }

    private void isRestart() {
        isRestart = gameService.isRestart();
    }
}

