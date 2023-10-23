package atividade02;

import java.util.Random;
import java.util.Scanner;

public class Guerreiro {
    String nome;
    int qtdVidas;
    
    void setNome(String nome){
        this.nome = nome;
    }
    int setVidas(){
        Random r = new Random();
        return r.nextInt(4)+9;
    }
     String vidaExtra(){
         Scanner sc = new Scanner(System.in);
         return sc.nextLine();
    }
}
