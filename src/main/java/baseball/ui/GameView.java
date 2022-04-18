package baseball.ui;

import camp.nextstep.edu.missionutils.Console;

import static baseball.core.Constant.*;

public class GameView {
    public String numberInputPrompt() {
        System.out.print(NUMBER_INPUT_PROMPT);
        return Console.readLine();
    }

    public String restartInputPrompt() {
        System.out.println(RESTART_INPUT_PROMPT);
        return Console.readLine();
    }

    public void displayResults(String gameResult) {
        System.out.println(gameResult.trim());
    }

    public void displayWin() {
        System.out.println(GAME_OVER_OUTPUT);
    }
}
