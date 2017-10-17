//Aaron Jeffers-Howard and bk 
//Workshop School Fall 2017 
//Dr. Millers Advisory, escape room project...

void setup() {
  //size(100, 100); //make program of certian size
  fullScreen();
}

void draw() {
  background(0); // normal background color
  File dir = new File("/Volumes"); //pull up list of volumes
  String[] children = dir.list(); //assign list to string
  if (children == null) { //if there is nothing do nothing
    // Ei2ther dir does not exist or is not a directory
  } else { //otherwise do what's below
    for (int i=0; i<children.length; i++) { //go through each list item
      // Get filename of file or directory
      String bk = children[i]; //
      if (bk.equals("KINGSTON")) { //if there is an item equal to the value do below
        background(0, 255, 0);
      } //set background green

      if (bk.equals("UNTITLED")) { //if there is an item equal to the value do below
        background(0, 0, 255);
      } //set background green
    }
  }
}