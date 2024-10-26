package decorators;

import models.Adicional;
import models.Tamanho;

public class LeiteCondensado extends BaseDecorator {
    private final Tamanho tamanho;

    public LeiteCondensado(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Leite Condensado";
    }

    @Override
    public double custo() {
        double adicional = 0.0;
        switch (tamanho) {
            case PEQUENO -> adicional = 1.50;
            case MEDIO -> adicional = 2.00;
            case GRANDE -> adicional = 2.50;
        }
        return wrappee.custo() + adicional;
    }
}