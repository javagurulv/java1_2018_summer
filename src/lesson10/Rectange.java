package lesson10;

public class Rectange extends AbstractShape {

    private double firstSide;
    private double secondSide;

    public Rectange(String title,
                    double firstSide,
                    double secondSide) {
        super(title);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }


    @Override
    public double calculateSquare() {
        return this.firstSide * this.secondSide;
    }

}
