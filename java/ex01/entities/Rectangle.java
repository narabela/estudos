package entities;

public class Rectangle {
    public double width; //largura, base    public double height; //altura
    public double height;

    public double calcularArea () {
        return width*height;
    }
    public double calcularPerimetro (){
        return 2*(width+height);
    }
    public double calcularDiagonal (){
        return Math.sqrt( (Math.pow(width, 2) +  (Math.pow(height, 2)) ));
    }

    public String toString () {
        return 
        calcularArea () 
        + ", Perimetro: " + calcularPerimetro() 
        + ", Diagonal: " + calcularDiagonal();
    }
    
}
