// ConcreteCreator: decide qual produto concreto será criado.
public final class ContratacaoMaritimo extends ContratacaoFrete {
    @Override
    protected Frete criarFrete() {
        return new FreteMaritimo();
    }
}
