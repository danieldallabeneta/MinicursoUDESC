package Enum;

/**
 *
 * @author danie
 */
public enum Cores {
    BRANCO(1, "Branco"),
    VERMELHO(2, "Vermelho"),
    PRETO(3, "Preto"),
    AMARELO(4, "Amarelo"),
    CINZA(5, "Cinza");

    private final int numero;
    private final String nomeCompleto;

    Cores(int numero, String nomeCompleto) {
        this.numero = numero;
        this.nomeCompleto = nomeCompleto;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

}