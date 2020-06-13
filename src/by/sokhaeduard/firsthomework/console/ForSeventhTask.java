package by.sokhaeduard.firsthomework.console;

import by.sokhaeduard.firsthomework.entity.Point;

public class ForSeventhTask {
	
	   public void printClosestPoint(Point point1, Point point2, int index) {
	        String result;
	        switch (index) {
	            case 0:
	                result = point1 + " has the same distance " + point2;
	                break;

	            case 1:
	                result = point1 + " is closer to origin than " + point2;
	                break;

	            case 2:
	                result = point2 + " is closer to origin than " + point1;
	                break;

	            default:
	                result = "";
	        }
	        System.out.println(result);
	    }

}
