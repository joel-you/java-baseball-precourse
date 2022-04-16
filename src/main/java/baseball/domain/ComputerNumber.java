package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ComputerNumber {
    private static final int MIN = 1;
    private static final int MAX = 9;
    private List<Integer> number;

    public ComputerNumber(List<Integer> number) {
        this.number = number;
    }

    public void setNumber() {
        // 순서보장를 보장해주는 Set = LinkedHashSet.
        Set<Integer> numberSet = new LinkedHashSet<>();
        while (numberSet.size() < 3) {
            numberSet.add(Randoms.pickNumberInRange(MIN, MAX));
        }
        this.number = new ArrayList<>(numberSet);
    }

}
