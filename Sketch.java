import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Draw a house
   * @author:n.judd
   */

  // size of the image
   public void settings() {
    size(600, 600);
  }

  // sets background colour
  public void setup() {
    background(66, 182, 245);
  }

  // draws house
  public void draw() {
    // base and ceiling
    stroke(255);
    line(175, 550, 425, 550);
    line(175, 325, 425, 325);
    // walls
    line(175, 550, 175, 325);
    line(425, 550, 425, 325);
    // roof
    triangle(175, 325, 425, 325, 300, 200);
    // door
    line(275, 475, 275, 550);
    line(325, 475, 325, 550);
    line(275, 475, 325, 475);
    // doornob
    ellipse(315, 515, 8, 8);
  }
}