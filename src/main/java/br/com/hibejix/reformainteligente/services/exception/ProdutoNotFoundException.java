package br.com.hibejix.reformainteligente.services.exception;

public class ProdutoNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ProdutoNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ProdutoNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
