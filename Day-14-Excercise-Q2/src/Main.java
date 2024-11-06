/*
Author: Ahmed Essam Taj
Date: 6, November
Day 14 - Exercise - Q2

 */
public class Main {
    public static void main(String[] args) {


        MovablePoint point = new MovablePoint(5,5,2,2);
        System.out.println("Point ( "+point.getX()+" , "+point.getY()+" )");
        point.moveDown();
        System.out.println("Point ( "+point.getX()+" , "+point.getY()+" )");
        point.moveUp();
        System.out.println("Point ( "+point.getX()+" , "+point.getY()+" )");
        point.moveLeft();
        System.out.println("Point ( "+point.getX()+" , "+point.getY()+" )");
        point.moveRight();
        System.out.println("Point ( "+point.getX()+" , "+point.getY()+" )");



    }


}