package models;

public class Acai implements Adicional {
    private final Tamanho tamanho;

    public Acai(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return "Açaí (" + tamanho + ")";
    }

    @Override
    public double custo() {
        return switch (tamanho) {
            case PEQUENO -> 5.00;
            case MEDIO -> 7.00;
            case GRANDE -> 9.00;
            default -> 0.0;
        };
    }
}
