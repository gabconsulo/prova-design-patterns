import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContratacaoFrete[] contratacoes = {
            new ContratacaoRodoviario(),
            new ContratacaoAereo(),
            new ContratacaoMaritimo()
        };
        for (ContratacaoFrete contratacao : contratacoes) {
            contratacao.contratar("cliente teste", new BigDecimal("1000"));
        }
    }
}
