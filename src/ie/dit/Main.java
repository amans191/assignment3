package ie.dit;

import processing.core.PApplet;

public class Main{

    public static void main(String[] args){
        String[] a = {"MAIN"};
        PApplet.runSketch(a, new GUI());

        Text test = new Text("test.txt");
        Text test2 = new Text("");

        test.readText();
        test2.readText();
    }
}
