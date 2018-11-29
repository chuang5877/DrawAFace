package com.company;

public class FaceDrawing {
    String[][] faceFeatures;

    FaceDrawing(String[][] faceFeatures) {
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column) {
        faceFeatures[row][column] = replace;
    }

    public void fill(String str) {
        for (int i = 0; i < faceFeatures.length; i++) {
            for (int n = 0; n < faceFeatures[i].length; n++) {
                    faceFeatures[i][n] = str;
            }
        }
    }
    public String toString(){
        String str="";
        for (int i = 0; i < faceFeatures.length; i++) {
            for (int n = 0; n < faceFeatures[i].length; n++) {
                str+=faceFeatures[i][n];
            }
            str+='\n';
        }
        return str;
    }
}
