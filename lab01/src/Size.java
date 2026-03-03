/**
 * Representa os tamanhos disponíveis (Pequeno, Médio, Grande).
 * Esta enumeração armazena intervalos de valores e códigos de referência para cada tamanho.
 * * @author João Palhoça
 * @version 1.0
 */
public enum Size {
    /** Tamanho pequeno, com intervalo de 32 a 36. */
    SMALL(32, 36, "Pequeno", 'S'),

    /** Tamanho médio, com intervalo de 37 a 44. */
    MEDIUM(37, 44, "Médio", 'M'),

    /** Tamanho grande, com intervalo de 45 a 52. */
    LARGE(45, 52, "Grande", 'L');

    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;

    /**
     * Construtor interno para definir as propriedades de cada tamanho.
     * * @param minValue    O valor mínimo do intervalo.
     * @param maxValue    O valor máximo do intervalo.
     * @param description A descrição textual amigável.
     * @param code        O caractere representativo (S, M ou L).
     */
    private Size(int minValue, int maxValue, String description, char code) {
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.code = code;
    }

    /**
     * Retorna a descrição do tamanho.
     * @return Uma String contendo a descrição (ex: "Médio").
     */
    @Override
    public String toString() {
        return this.description;
    }

    /**
     * Obtém a descrição textual.
     * @return A descrição do tamanho.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Obtém o valor mínimo associado ao tamanho.
     * @return O valor mínimo inteiro.
     */
    public int getMinValue() {
        return minValue;
    }

    /**
     * Obtém o valor máximo associado ao tamanho.
     * @return O valor máximo inteiro.
     */
    public int getMaxValue() {
        return maxValue;
    }

    /**
     * Obtém o código de caractere único do tamanho.
     * @return O caractere representativo.
     */
    public char getCode() {
        return code;
    }
}