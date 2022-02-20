package chapter6;

public class Restangle {

    private double lenght;
    private double width;

    public Restangle(){
        lenght = 0;
        width = 0;
    }

    public Restangle(double lenght, double width){
        this.lenght = lenght; // can be set this way
        setWidth(width); // or can be set this way
    }

    public double getLenght(){
        return lenght;
    }

    public void setLenght(double lenght){
        this.lenght = lenght;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * lenght) + (2 * width);
    }

    public double calculateArea(){
        return lenght * width;
    }
}
