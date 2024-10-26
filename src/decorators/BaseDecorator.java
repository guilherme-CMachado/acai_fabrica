package decorators;


import models.Adicional;

public abstract class BaseDecorator implements Adicional {
    protected Adicional wrappee;

    public BaseDecorator(Adicional wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescricao() {
        return wrappee.getDescricao();
    }

    @Override
    public double custo() {
        return wrappee.custo();
    }
}
