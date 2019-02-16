package Test_24_exception;

public class GenderMisMatchException extends Exception{

    public GenderMisMatchException(){

    }

    public GenderMisMatchException(String message){
        super(message);
    }
}
