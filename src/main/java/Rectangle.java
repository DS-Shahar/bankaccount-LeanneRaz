package bank1;

public class Rectangle {
	
	private int length;
    private int width;
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void drawRectangle(int length, int width) {
		for(int i=0; i<length; i++) {
			for(int j=0; j<width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int calcArea(int length, int width) {
		return length*width;
	}
	
	public int calcPerimeter() {
		return length + length + width + width;
	}
	 
	public String scale(int factor) {
		int newlength = factor * length;
		int newwidth = factor * width;
		return "New Rectangle [length=" + newlength + ", width=" + newwidth + "]";
	}
	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
    
}
