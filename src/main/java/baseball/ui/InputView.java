package baseball.ui;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String NUMBER_INPUT_PROMPT = "숫자를 입력해주세요 : ";
    private static final String RESTART_INPUT_PROMPT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";


    public String numberInputPrompt() {
        System.out.println(NUMBER_INPUT_PROMPT);
        return Console.readLine();
    }

    public String restartInputPrompt() {
        System.out.println(RESTART_INPUT_PROMPT);
        return Console.readLine();
    }
}
