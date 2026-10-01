public final class ContratacaoRodoviario extends ContratacaoFrete {
    @Override
    protected Frete criarFrete() {
        return new FreteRodoviario();
    }
}
