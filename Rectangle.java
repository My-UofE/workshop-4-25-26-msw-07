// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor: 
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

 // third constructor
  public Rectangle(){
    this(1, 1, 0, 0);
  }
  

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  public void scale(double scaleX, double scaleY) {
    width = width*scaleX;
    height = height*scaleY;
  }

  public void scale(double scaleBoth){
    width = width*scaleBoth;
    height = height*scaleBoth;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  public boolean isOverlappedWith(Rectangle r){
    double thisLeft   = this.originX;
    double thisRight  = this.originX + this.width;
    double thisBottom = this.originY;
    double thisTop    = this.originY + this.height;

    double rLeft   = r.originX;
    double rRight  = r.originX + r.width;
    double rBottom = r.originY;
    double rTop    = r.originY + r.height;

    if (thisRight <= rLeft ||
        thisLeft >= rRight ||
        thisTop <= rBottom ||
        thisBottom >= rTop) {
        return false;
    }

    return true;
    }
  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    return r1.isOverlappedWith(r2);
  }

  public double calcRatio(){
    return width/height;
  }
  public boolean isSquare() {
    double ratio = calcRatio();
    return (ratio >= 0.999 && ratio <= 1.001);
  }
  }

