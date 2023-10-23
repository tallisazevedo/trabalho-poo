package atividade02;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Oraculo {
    String nome;
    Guerreiro warrior;
    
    void setNome(String nome){
        this.nome = nome;
    }
    String prologoIntroducao(){
        return "Ola Guerreiro sou "+nome+", seu oraculo. Voce tem "+warrior.qtdVidas+" vidas para tentar advinhar o numero misterioso.";
    }
    boolean loadLevel1(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int segredo =  r.nextInt(100)+1;
        int chute;
        while(warrior.qtdVidas>0){
            System.out.println("Vidas: "+warrior.qtdVidas);
            System.out.print("Chute um numero entre 0 e 100: ");
            chute = sc.nextInt();
            if(chute>segredo){
                System.out.println("Dica: Chute um numero menor");
                warrior.qtdVidas --;
            }
            else if(chute<segredo){
                System.out.println("Dica: Chute um numero maior");
                warrior.qtdVidas --;
            }
            else{
                System.out.println("Voce passou de fase");
                return true;                
            }
            
        }
        return false;
    }
    boolean loadLevel2(int opcao){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while(warrior.qtdVidas>0){
            System.out.println("Vidas: "+warrior.qtdVidas);
            System.out.println("Escolha 0 para par e 1 para impar");
            opcao = sc.nextInt();
            int a =r.nextInt(5);
            int b =r.nextInt(5);
            if(opcao == 0){
                if((a+b)%2 == 0){
                    return true;
                }
                else{
                    warrior.qtdVidas --;
                }
            }
            else if(opcao == 1){
                if((a+b)%2 == 0){
                    warrior.qtdVidas --;
                }
                else{
                    return true;
                }
        
            }
            
        }
        return false;
    }
    boolean decidirVidaExtra(String misericordia){
        StringTokenizer st = new StringTokenizer(misericordia);
        int tc = st.countTokens();
        if(tc > 5){
            System.out.println("perdoado");
            return true;
        }else{
            System.out.println("nao perdoado");
            return false;
        }
    }
     String prologoVencedor(){
         return "Parabens, voce, "+warrior.nome+", venceu o oraculo "+this.nome;
     }
     String prologoPerdedor(){
         return "Infelizmente, voce, "+warrior.nome+", foi derrotado pelo oraculo "+this.nome;
     }
    
}
