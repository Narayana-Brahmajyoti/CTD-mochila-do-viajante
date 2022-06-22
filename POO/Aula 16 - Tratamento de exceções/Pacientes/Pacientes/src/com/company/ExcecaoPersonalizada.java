package com.company;

public class ExcecaoPersonalizada extends Exception{
    public ExcecaoPersonalizada() {
        super();
    }

    public ExcecaoPersonalizada(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Ocorreu a seguinte exceção: " + this.getMessage();
    }
}
