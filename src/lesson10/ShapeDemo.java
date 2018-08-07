package lesson10;

import java.util.ArrayList;
import java.util.List;

public class ShapeDemo {

    public static void main(String[] args) {
        List<Shape> rooms = new ArrayList<>();

        Shape room1 = new Square("room1", 10.0);
        Shape room2 = new Square("room2", 100.0);
        Shape room3 = new Square("room3", 90.0);

        Shape room4 = new Rectange("room4", 10.0, 10.0);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        double totalSquare = 0.0;
        for (Shape room : rooms) {
            System.out.println("Room " + room.getTitle()
                + "  square = " + room.calculateSquare());
            totalSquare += room.calculateSquare();
        }

        System.out.println("Total square = " + totalSquare);
    }

}
