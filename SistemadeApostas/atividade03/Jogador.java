
package atividade03;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogador {
    int idJogador;
    String nome;
    String sobrenome;
    String apelido;
    String cpf;
    String nacionalidade;
    Date dataNascimento;
    Credito c;
    
    List<Aposta> apostas = new ArrayList<>();
    
    public Jogador(int idJogador){
        
        this.idJogador = idJogador;
        this.nome = InOut.leString("Insira um nome:");;
        this.apelido = InOut.leString("Insira um apelido:");;
        this.cpf = InOut.leString("Insira o cpf:");;
        this.c = new Credito("R$");
        
        
    
    }
    void menu(){
        int opc = InOut.leInt("Olá "+this.apelido+"!"+"\nSaldo: "+c.moeda+c.saldo+"\n1: Adcionar fundos\n2: Sacar\n3: Apostar\n4: Ver apostas\nOutro: Sair");
        if(opc == 1){
            this.adcionarFundos();
        }
        if(opc == 2){
            this.sacar();
        }
        if(opc == 3){
            this.apostar();
        }
        if(opc == 4){
            this.verApostas();  
        }
        
        
    }
    void adcionarFundos(){
        double valor;
        valor = InOut.leDouble("Quanto deseja adcionar?");
        if(valor > 0){
            this.c.saldo += valor;
        }
        else
            InOut.MsgDeErro("ERRO", "Valor inválido");
        this.menu();
    }
    void sacar(){
        double sacado;
        boolean l = true;
        
        while(l ==true){
            sacado = InOut.leDouble("Quanto deseja sacar?\nSeu saldo: "+this.c.moeda+this.c.saldo+"\nSaque mínimo: "+this.c.moeda+"20");
            if(sacado > this.c.saldo || sacado < 20){
                InOut.MsgDeErro("Erro"," Valor inválido.Tente novamente.");
            }
            else{
                l = false;
                this.c.saldo -= sacado;
            }
        }
        this.menu();
        
    }
    void apostar(){
        Aposta a = new Aposta();
        boolean loop = true;
        double valor = 0;
        while(loop == true){
            valor = a.valorAposta = InOut.leFloat("Saldo: "+this.c.moeda+this.c.saldo+"\nInsira o valor da aposta: ");
            if(valor>this.c.saldo || valor<0){
                InOut.MsgDeErro("Erro", "Valor Inválido");
            }
            else{
                this.c.saldo -= valor;
                loop = false;
            }
        }
        a.inserirJogo(c);
        if(a.jogos.isEmpty())
            this.c.saldo += valor;
        else
            this.apostas.add(a); 
        this.menu();
        
    }
    void verApostas(){
        if(this.apostas.isEmpty()){
            InOut.MsgDeAviso("AVISO", "Nenhum jogo apostado");
        }
        else{
            for(int i = 0; i<this.apostas.size();i++){
                InOut.MsgDeInformacao("Apostas",
                        "Aposta "+(i+1)+" "+this.c.moeda+this.apostas.get(i).valorAposta+verJogos(i));
            }
        }
        this.menu();
    }
    String verJogos(int i){
        String s = " \n";
        for(int j = 0; j<this.apostas.get(i).jogos.size();j++){
            s += this.apostas.get(i).jogos.get(j).descritivo;
            if(this.apostas.get(i).jogos.get(j).apostado == 1){
            s += "\n-CASA";
            }
            else
              s+="\n-VISITANTE";
            s += "\n";
            
        }
        return s;
    }

}
