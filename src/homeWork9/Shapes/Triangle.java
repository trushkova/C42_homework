package homeWork9.Shapes;

public class Triangle extends Figure {
    public double sideX;
    public double sideY;
    public double sideZ;

    public Triangle(double sideX, double sideY, double sideZ) {
        this.sideX = sideX;
        this.sideY = sideY;
        this.sideZ = sideZ;
    }
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideX) * (p - sideY) * (p - sideZ));
    }

    @Override
    public double getPerimeter() {
        return sideX + sideY + sideZ;
    }
}
