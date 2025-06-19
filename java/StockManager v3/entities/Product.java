package entities;

public class Product {
    private String name;
    private double price;
    private int quantitity;


    //construtor padrão
    public Product (){
        
    }

    //construtor
    //é executado no momento da instanciação do objeto
    public Product (String name, double price, int quantitity){
        this.name= name;
        this.price=price;
        this.quantitity=quantitity;

    }

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantitity() {
        return quantitity;
    }
    //não foi criado o setQuantity para proteger o objeto produto, que podera somente ser alterado somente com entrada ou saida do produto

    

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