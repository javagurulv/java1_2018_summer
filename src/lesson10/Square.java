package lesson10;

public class Square extends AbstractShape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double calculateSquare() {
        return this.side * this.side;
    }

}
