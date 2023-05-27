package org.example;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(String errorMensaje){
        super(errorMensaje);
    }
}
