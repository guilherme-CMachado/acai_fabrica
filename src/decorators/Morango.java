package decorators;
import models.Adicional;
import models.Tamanho;

public class Morango extends BaseDecorator {
    private final Tamanho tamanho;

    public Morango(Adicional wrappee, Tamanho tamanho) {
        super(wrappee);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao() + ", Morango";
    }

    @Override
    public double custo() {
        double adicional = 0.0;
        switch (tamanho) {
            case PEQUENO -> adicional = 1.00;
            case MEDIO -> adicional = 1.50;
            case GRANDE -> adicional = 2.00;
        }
        return wrappee.custo() + adicional;
    }
}