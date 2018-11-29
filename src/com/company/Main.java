package com.company;

public class Main {

    public static void main(String[] args) {
	String[][] face=new String[10][10];
	FaceDrawing face1=new FaceDrawing(face);
	face1.fill("O");
	System.out.println(face1);
    }
}
