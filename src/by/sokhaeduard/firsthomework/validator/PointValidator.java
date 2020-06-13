package by.sokhaeduard.firsthomework.validator;

import by.sokhaeduard.firsthomework.entity.Point;

public class PointValidator {
    public static final double XSTART = -10;
    public static final double XEND = 10;
    public static final double YSTART = -10;
    public static final double YEND = 10;

    public boolean validatePoint(Point point) {
        return (point.getX() >= XSTART &&
                point.getX() <= XEND &&
                point.getY() >= YSTART &&
                point.getY() <= YEND);
    }

    public boolean validateX(double x) {
        return (x>=XSTART && x<=XEND);
    }
}
