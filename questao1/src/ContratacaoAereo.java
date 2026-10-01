public final class ContratacaoAereo extends ContratacaoFrete {
    @Override
    protected Frete criarFrete() {
        return new FreteAereo();
    }
}
