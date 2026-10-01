public final class FabricaBrasil implements FabricaAssinatura {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NotaFiscalBrasil();
    }
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }
    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLGPD();
    }
}
