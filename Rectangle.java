public class Rectangle {
    private int width;
    private int lenght;
    
    public Rectangle(int theWidth, int theLength) {
        width = theWidth;
        length = theLength;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getArea() {
        return width*length;
    }
    
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
    
}+
