package racingcar.Car;

public class Position {
    private int position;


    public Position(int position) {
        this.position = position;
    }

    public int getPosition(){
        return this.position;
    }

    public void addPosition(){
        position++;
    }
}
