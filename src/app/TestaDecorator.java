package app;

import decorators.Banana;
import decorators.LeiteCondensado;
import decorators.Morango;
import models.Acai;
import models.Adicional;
import models.Tamanho;

public class TestaDecorator {
    public static void main(String[] args) {
        Adicional acaiSimples = new Acai(Tamanho.PEQUENO);
        System.out.println(acaiSimples.getDescricao() + " Custo: R$ " + acaiSimples.custo());

      
        Adicional acaiComMorango = new Morango(new Acai(Tamanho.MEDIO), Tamanho.MEDIO);
        System.out.println(acaiComMorango.getDescricao() + " Custo: R$ " + acaiComMorango.custo());

 
        Adicional acaiCompleto = new Banana(new LeiteCondensado(new Morango(new Acai(Tamanho.GRANDE), Tamanho.GRANDE), Tamanho.GRANDE), Tamanho.GRANDE);
        System.out.println(acaiCompleto.getDescricao() + " Custo: R$ " + acaiCompleto.custo());
    }
}
