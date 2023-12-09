package exercise24_25;

public class UncheckedBasketFullException extends  RuntimeException{

    //metoden qe ne duam ta therrasim ne momentin qe ky Exception behet throw
    public UncheckedBasketFullException(String message){
        super(message);
    }
}
