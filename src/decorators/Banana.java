package decorators;

import models.Adicional;
import models.Tamanho;

public class Banana extends BaseDecorator {
    private final Tamanho tamanho;

    public Banana(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Banana";
    }

    @Override
    public double custo() {
        double adicional = 0.0;
        switch (tamanho) {
            case PEQUENO -> adicional = 0.80;
            case MEDIO -> adicional = 1.20;
            case GRANDE -> adicional = 1.60;
        }
        return wrappee.custo() + adicional;
    }
}