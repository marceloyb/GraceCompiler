package main.exceptions;

public class UndeclaredId extends RuntimeException{
    public UndeclaredId(){
        super("Reference to an unknown variable/identifier");
    }
}
