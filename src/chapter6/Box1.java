package chapter6;

public class Box1 {
    double width;
    double height;
    double depth;

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double vole() {
        return width * height * depth;
    }
}
