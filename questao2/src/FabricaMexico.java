public final class FabricaMexico implements FabricaAssinatura {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NotaFiscalMexico();
    }
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoSPEI();
    }
    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoLFPDPPP();
    }
}
