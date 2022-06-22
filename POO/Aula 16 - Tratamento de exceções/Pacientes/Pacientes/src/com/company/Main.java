package com.company;

import java.util.Date;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {
        try{
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(10,5,2021));
        }
        catch (ExcecaoPersonalizada e){
            System.out.println(e.getMessage());
        }

    }
}