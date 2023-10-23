
package atividade02;

public class Atividade02 {


    public static void main(String[] args) {

        Guerreiro g = new Guerreiro();
        Oraculo o = new Oraculo();
        
        o.warrior = g;
        o.setNome("Charles");
        g.setNome("Alberto");
        g.qtdVidas = g.setVidas();
        
        System.out.println(o.prologoIntroducao());
        if(o.loadLevel1()){
            if(o.loadLevel2(0)){
                System.out.println(o.prologoVencedor());
            }
            else{
                System.out.println(o.prologoPerdedor());
            }
        }
        else{
            System.out.println(o.prologoPerdedor());
        }
    }
    
}
