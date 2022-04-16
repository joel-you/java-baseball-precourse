package baseball.domain;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {
    private List<Integer> number;

    public void setNumber(String inputStr) {
        if (!inputStr.matches("^[1-9]{3}$")) {
            throw new IllegalArgumentException("Invalid Request");
        }

        Set<Integer> numberSet = new LinkedHashSet<>();
        for (String s: inputStr.split("")) {
            numberSet.add(Integer.valueOf(s));
        }

        this.number = new ArrayList<>(numberSet);
    }
}
