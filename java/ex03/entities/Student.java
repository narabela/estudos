package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double calcularMedia () {
        return grade1+grade2+grade3;
    }

    public boolean aprovacao (){

        if (calcularMedia() > 60.0) {
            System.out.println("PASS!");
            return true;
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60.00-calcularMedia()) + " POINTS!" );
            return false;
        }
  
    }
    


    //nota final
    //se esta aprovado PASS OR FAILED se failed quanto faltou

}
