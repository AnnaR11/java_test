package ru.stqa.pft.sandbox;

public class MyFirstProgram {

   public static void main(String[] args) {

     System.out.println ("Hello, world!");
     double a=2;
     double b=3;
     double c=1;
     double d=4;
     System.out.println("Расстояние между двумя точками координат на плоскости" + "=" + (Math.sqrt((a-b)*(a-b)+(c-d)*(c-d))));

     Point p = new Point(5,6,7,8);


     System.out.println("Расстояние между двумя точками" + "=" + distance(p));
   }
  public static double distance (Point p) {
    return Math.sqrt((p.a - p.b) * (p.a - p.b) + (p.c - p.d) * (p.c - p.d));
  }
}