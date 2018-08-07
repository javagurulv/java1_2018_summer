package lesson10;

public abstract class AbstractShape implements Shape {

    private String title;

    public AbstractShape(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
