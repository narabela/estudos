package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;


    //Construtor padrão
    public Product (){

    }


    //construtor
    //é executado no momento da instanciação do objeto
    public Product (String name, double price, int quantitity){
        this.name= name;
        this.price=price;
        this.quantity=quantitity;

    }

    //sobrecarga - disponibilizar mais de uma versão da mesma operação, o que diferencia são os parametros
    public Product (String name, double price){
        this.name= name;
        this.price=price;


    }

    public double totalValueInStock (){
        return quantity * price;
    }

    public void addProducts (int quantity) {
        //this é uma palavra reservada, é uma autoreferencia ao objeto
        //o this.quantity puxa o atributo declarado na classe Product enquanto o outro quantity puxa o quantitity declarado no parametro
        this.quantity += quantity;
    }

    public void removeProducts (int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ "+  price+ " , " + quantity + " units, TOTAL: $" +  totalValueInStock();
    }


}