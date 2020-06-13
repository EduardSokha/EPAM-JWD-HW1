package by.sokhaeduard.firsthomework.service;

import by.sokhaeduard.firsthomework.entity.Point;

public class DotLogic {
	public int defineDistance(Point point1, Point point2) {
		if (point1.distanceFromOrigin() < point2.distanceFromOrigin()) {
			return 1;
		}
		if (point1.distanceFromOrigin() > point2.distanceFromOrigin()) {
			return 2;
		}

		return 0;
	}
}
