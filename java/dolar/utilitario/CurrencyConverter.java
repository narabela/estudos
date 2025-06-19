package utilitario;

public class CurrencyConverter {

    public static double converter (double dollar, int quantity){
        return (dollar*quantity * 0.06) + (dollar*quantity);
    }


}