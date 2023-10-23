
package atividade01;

import java.util.ArrayList;
import java.util.List;


public class Atividade01 {


    public static void main(String[] args) {
        
        
        Imovel i1 = new Imovel("10vv","Roberto", 120, 2);
        Imovel i2 = new Imovel("20vv","Vinicius", 100, 13);
        Imovel i3 = new Imovel("30vv","Alessandro", 90.90, 5);
        Imovel i4 = new Imovel("40vv","Thiago", 170.90, 6);
        Imovel i5 = new Imovel("50vv","Arthur", 80.50, 7);
        Imovel i6 = new Imovel("60vv","Pedro", 50, 8);
        
        Municipio vv = new Municipio("Vila Velha");
        
        vv.adcionarImovel(i1);
        vv.adcionarImovel(i2);
        vv.adcionarImovel(i3);
        vv.adcionarImovel(i4);
        vv.adcionarImovel(i5);
        vv.adcionarImovel(i6);
        
        for(String s : vv.imoveis.keySet()){
            System.out.println("Proprietario: "+ vv.buscarImovel(s).nome);
            System.out.println("Multa: R$"+vv.multa(s));
            System.out.println();
        }
    }
    
}
