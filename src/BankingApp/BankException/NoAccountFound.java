package BankingApp.BankException;

public class NoAccountFound extends RuntimeException{
    public NoAccountFound(String message){
        super(message);
    }
}
