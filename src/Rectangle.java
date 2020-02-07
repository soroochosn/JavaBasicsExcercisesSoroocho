public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + this.getArea() +
                ", diagonal=" + this.getDiagonal()+
                ", is it a square=" + this.isSqaure()+
                '}';
    }

    public double getArea(){
        double area = length * width;
        return area;
    }
    public double getDiagonal(){
        double a = length*length;
        double b = width*width;
        double c = Math.sqrt(b+a);
        return c;
    }
    public boolean isSqaure(){
        if(length==width){
            return true;
        }else{
            return false;
        }
    }
}
