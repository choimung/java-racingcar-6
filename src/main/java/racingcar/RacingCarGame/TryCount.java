package racingcar.RacingCarGame;

import racingcar.Constants;

public class TryCount {

    private final int count;

    public TryCount(int count) {
        validateCount(count);
        this.count = count;
    }

    public int getTryCount() {
        return count;
    }

    private void validateCount(int count) {
        if (count < Constants.MIN_TRY_COUNT) {
            throw new IllegalArgumentException(Constants.ERROR_MIN_TRY_COUNT);
        }
    }
}
