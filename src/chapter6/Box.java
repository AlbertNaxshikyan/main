package chapter6;

public class Box {
    double width;
    double height;
    double depth;



    void volume() {
        System.out.println("Объем равен: ");
        System.out.println(width * height * depth);
    }

    double vole() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        }
    }



