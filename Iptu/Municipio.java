
package atividade01;


import java.util.HashMap;
import java.util.Map;


public class Municipio {
    String nome;
    Map<String,Imovel> imoveis = new HashMap<>();
    
    public Municipio(String nome){
        this.nome = nome;
    }
    
    void adcionarImovel(Imovel im){
        if(imoveis.containsKey(im.matricula) == false){
            imoveis.put(im.matricula, im);
        }
        else{
            System.out.println("Esse imóvel já foi adcionado");
        }
    }
        double multa(String k){
            Imovel ir = imoveis.get(k);
            
        
            if(ir.meses>=0 && ir.meses<=5){
                return ir.imposto*0.01;
            }
            else if(ir.meses>=6 && ir.meses<=8){
                return ir.imposto*0.023;
            }
            else if(ir.meses>=9 && ir.meses<=10){
                return ir.imposto*0.03;
            }
            else if(ir.meses>=11 && ir.meses<=12){
                return ir.imposto*0.054;
            }
            else if(ir.meses>12){
                return ir.imposto*0.1;
            }
            else{
                return 0;
            }

        }
        Imovel buscarImovel(String s){
           return this.imoveis.get(s);
        }
}
