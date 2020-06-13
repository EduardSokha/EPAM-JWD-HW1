package by.sokhaeduard.firsthomework.service;

import org.junit.Assert;
import org.junit.Test;

public class TestFigureLogic {

    @Test
    public void testSquareForSide() {
          double expected = 4;
          double realy = new FigureLogic().getSquareForSide(16.0);
          Assert.assertEquals(realy, expected, 0.0001);
    }
    
    @Test
    public void testRadiusInscribedCircle() {
          double expected = 8;
          double realy = new FigureLogic().getRadiusInscribedCircle(16.0);
          Assert.assertEquals(realy, expected, 0.0001);
    }
    
    @Test
    public void testInscribedSquareCircle() {
          double expected = 2.8284;
          double realy = new FigureLogic().getInscribedSquareCircle(2.0);
          Assert.assertEquals(realy, expected, 0.0001);
    }
    
    @Test
    public void testSquareScale() {
          double expected = 2.0000;
          double realy = new FigureLogic().getSquareScale(4.0, 2.8284);
          Assert.assertEquals(realy, expected, 0.0001);
    }
    
    @Test
    public void testGetArea() {
          double expected = 7.9999;
          double realy = new FigureLogic().getArea(2.8284);
          Assert.assertEquals(realy, expected, 0.0001);
    }
    
}
