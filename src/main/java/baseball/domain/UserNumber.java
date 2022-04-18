package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    private List<Integer> number;

    public UserNumber(List<Integer> number) {
        this.number = number;
    }

    public UserNumber() {}

    public void setNumber(String inputStr) {
        if (!inputStr.matches("^[1-9]{3}$")) {
            throw new IllegalArgumentException("Invalid Request");
        }

        List<Integer> numberSet = new ArrayList<>();
        for (String s: inputStr.split("")) {
            numberSet.add(Integer.valueOf(s));
        }

        this.number = new ArrayList<>(numberSet);
    }

    public List<Integer> getNumber() {
        return number;
    }
}
