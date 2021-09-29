package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p = new Point(2, 3, 1, 4);
    Assert.assertEquals(p.distance(),3.1622776601683795);
  }
}
