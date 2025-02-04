public class ColoredSquare extends Square {
  private String color;
  private final String DEFAULT_COLOR = "Gold";

  public ColoredSquare(){
    //Call to super() is implicit
    this.color = DEFAULT_COLOR;
  }

  public ColoredSquare(Integer sideLength){
    super(sideLength);
    //What will happen if we call 
    //this(sideLength) instead?
  
  }

  //Overloading
  public ColoredSquare(Integer sideLength, String color){
    //ILLEGAL because sideLength is private in Square
    //this.sideLength = sideLength;

    super(sideLength);//Calling the constructor of Square
    this.color = color;
  }

  public String toString(){
    return super.toString() + ". It has a " + color + " color.";
    //What will happen if we omit super?
  }

  public boolean equals(Object other){
    boolean result = false;
    if(other instanceof ColoredSquare){
      ColoredSquare cs = (ColoredSquare) other;
      result = super.equals(other) && this.color.equals(cs.color);
      //What happens if we use this.color == cs.color?
    }
    return result;
  }
}
