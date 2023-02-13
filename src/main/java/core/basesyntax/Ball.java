package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Ball [" + color + ":" + number + "]";
    }
}