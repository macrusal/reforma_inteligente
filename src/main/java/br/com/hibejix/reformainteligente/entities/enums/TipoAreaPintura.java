package br.com.hibejix.reformainteligente.entities.enums;

public enum TipoAreaPintura {

    FRENTE(1, "Frente"),
    FUNDO(2, "Fundo"),
    LADO_ESQUERDO(3, "Lado Esquerdo"),
    LADO_DIREITO(4, "Lado Direito"),
    TETO(5, "Teto"),
    CHAO(6, "Chão");

    private int codigo;
    private String descricao;

    /**
     * @param codigo
     * @param descricao
     */
    private TipoAreaPintura(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    public static TipoAreaPintura toEnum(Integer codigo) {
        if(codigo == null) {
            return null;
        }

        for (TipoAreaPintura x : TipoAreaPintura.values()) {
            if(codigo.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + codigo);
    }
}
