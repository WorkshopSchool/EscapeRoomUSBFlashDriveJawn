import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class EscapeRoomUSBFlashDriveJawn extends PApplet {

//Aaron Jeffers-Howard and bk 
//Workshop School Fall 2017 
//Dr. Millers Advisory, escape room project...
PImage bg, water, bigben, liberty, sking1, sking2, elements, waves, zoobity;

public void setup() {
  //size(100, 100); //make program of certian size
  
  bg = loadImage("desktop.png");
  water = loadImage("aqua.png");
  bigben = loadImage("BigBenFranklin.png");
  liberty = loadImage("libbell.png");
  sking1 = loadImage("sking.png");
  sking2 = loadImage("sking2.png");
  elements = loadImage("theelements.png");
  waves = loadImage("waves.png");
  zoobity = loadImage("zoobitybop.png");
}

public void draw() {
  background(bg); // normal background color
  File dir = new File("/Volumes"); //pull up list of volumes
  String[] children = dir.list(); //assign list to string
  if (children == null) { //if there is nothing do nothing
    // Ei2ther dir does not exist or is not a directory
  } else { //otherwise do what's below
    for (int i=0; i<children.length; i++) { //go through each list item
      // Get filename of file or directory
      String bk = children[i]; //
      if (bk.equals("DELTA")) { //if there is an item equal to the value do below
        background(255, 255, 0);

        image(sking2, 0, 0);
        textSize(45);
        fill(0);
        text("You can, you should, and if you're brave enough to start, you will.", 10, height/2+150);
      } //set background yellow
      if (bk.equals("STIGMA")) { //if there is an item equal to the value do below
        background(155);
        image(bigben, 0, 0);
        image(liberty, width/2+50, 10);
        image(zoobity, width/2-50, height/2+100);
      } //set background grey
      if (bk.equals("OMEGA")) { //if there is an item equal to the value do below
        background(0);
        image(water, 0, 0);
        image(elements, width/2+50, 10);
        image(waves, width/2, height/2);
      } //set background blk
      if (bk.equals("THETA")) { //if there is an item equal to the value do below
        background(255, 0, 0);
        fill(0);
        textSize(45);
        text("I was born in ____", 10, 60);
        text("In Independence Hall", 10, 100);
        text("I am very precious to most Americans", 10, 140);
        text("and signed by 56 people in all.", 10, 180);
        text("I am the Declaration of Independence.", 10, 220);
      } //set background red/blk
    }
  }
}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--hide-stop", "EscapeRoomUSBFlashDriveJawn" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
