
package atividade03;

public class Jogo {
    int idJogo;
    String descritivo;
    int apostado;
    double apostaMax;
    double premioMax;
    double oddTime1;
    double oddTime2;
    double oddEmpate;
    
    public Jogo(String descritivo,double oddTime1,double oddTime2,double oddEmpate){
        this.descritivo = descritivo;
        this.oddTime1 = oddTime1;
        this.oddTime2 = oddTime2;
        this.oddEmpate = oddEmpate;
    }
}
