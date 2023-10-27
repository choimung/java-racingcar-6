package racingcar.RacingCarGame;

public class TryCount {

    private static final int MIN_TRY_COUNT = 1;
    private int count;

    public TryCount(int count) {
        validateCount(count);
        this.count = count;
    }

    public int getTryCount(){
        return count;
    }

    private void validateCount(int count){
        if(count < MIN_TRY_COUNT){
            throw new IllegalArgumentException("시도 횟수는 1 이상이어야합니다.");
        }
    }
}
