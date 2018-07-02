package br.com.hibejix.reformainteligente.services.exception;

public class AreaNotFoundException  extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public AreaNotFoundException(String mensagem) {
        super(mensagem);
    }

    public AreaNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
