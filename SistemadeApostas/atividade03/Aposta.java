
package atividade03;

import java.util.ArrayList;
import java.util.List;


public class Aposta {
    int idAposta;
    double valorAposta;
    int repetir;
    
    List<Jogo> jogos = new ArrayList<>();
    
    public Aposta(){
    
    }
    void inserirJogo(Credito c){
        boolean loop = true;
        while(loop == true){
            Jogo flaflu = new Jogo("FLAMENGO X FLUMINENSE",1.2,2.5,3);
            Jogo vascru = new Jogo("VASCO X CRUZEIRO",1.4,3,2);
            Jogo camcui = new Jogo("ATLÉTICO MINEIRO X CUIABÁ",1.5,3,3.2);
            Jogo botpal = new Jogo("BOTAFOGO X PALMEIRAS",1.3,1.2,2);
            Jogo sanfor = new Jogo("SANTOS X FORTALEZA",2,2.2,1.4);
            int opc = InOut.leInt("Saldo: "+c.moeda+c.saldo+"\nSelecione o jogo que deseja apostar"
                    + "\n1: "+flaflu.descritivo
                    + "\n2: "+vascru.descritivo
                    + "\n3: "+camcui.descritivo
                    + "\n4: "+botpal.descritivo
                    + "\n5: "+sanfor.descritivo
                    + "\nOutro: sair"

            );
            switch (opc) {
                case 1:
                    if(this.jogos.contains(flaflu) == false){
                        this.jogos.add(flaflu);
                    }else{
                        InOut.MsgDeErro("Erro", "Você já adcionou esse jogo.");
                    }
                    break;
                case 2:
                    if(this.jogos.contains(vascru) == false){
                        this.jogos.add(vascru);
                    }else{
                        InOut.MsgDeErro("Erro", "Você já adcionou esse jogo.");
                    }
                    break;
                case 3:
                    if(this.jogos.contains(camcui) == false){
                        this.jogos.add(camcui);
                    }else{
                        InOut.MsgDeErro("Erro", "Você já adcionou esse jogo.");
                    }
                    break;
                case 4:
                    if(this.jogos.contains(botpal) == false){
                        this.jogos.add(botpal);
                    }else{
                        InOut.MsgDeErro("Erro", "Você já adcionou esse jogo.");
                    }
                    break;
                case 5:
                    if(this.jogos.contains(sanfor) == false){
                        this.jogos.add(sanfor);
                    }else{
                        InOut.MsgDeErro("Erro", "Você já adcionou esse jogo.");
                    }
                    break;
                default:
                    loop = false;
                    break;
            }
            if(loop == true){
                    this.ultimoJogo().apostado = InOut.leInt(this.ultimoJogo().descritivo+"\n1: Apostar no time da casa ("+this.ultimoJogo().oddTime1+")\n"
                            + "2: Apostar no time visitante ("+this.ultimoJogo().oddTime2+")\nOutro: Sair");
                    if(this.ultimoJogo().apostado != 1 && this.ultimoJogo().apostado != 2){
                        jogos.remove(this.ultimoJogo());
                    }

            }
        }
    }
    Jogo ultimoJogo(){
        return this.jogos.get(jogos.size() - 1);
    }
}