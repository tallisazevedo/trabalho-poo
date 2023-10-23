package atividade03;

public class Credito {
    double saldo;
    String validade;
    String moeda;
    boolean bloqueado;
    
    public Credito(String moeda){
        this.moeda = moeda;
        this.bloqueado = false;
        while(this.bloqueado == false){
            this.saldo = InOut.leDouble("Insira o valor do depósito inicial: ");
            if(this.saldo < 20){
                InOut.MsgDeErro("Erro","O primeiro depósito deve ser maior que "+this.moeda+"20");
            }
            else
                this.bloqueado = true;
        }
    }
}
