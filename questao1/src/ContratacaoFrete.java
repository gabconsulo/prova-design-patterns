import java.math.BigDecimal;
import java.text.NumberFormat;

public abstract class ContratacaoFrete {
    protected abstract Frete criarFrete();

    public final void contratar(String cliente, BigDecimal valorCarga) {
        Frete frete = criarFrete();
        BigDecimal valorFrete = frete.calcularValor(valorCarga);
        NumberFormat moeda = NumberFormat.getCurrencyInstance();

        System.out.println("Modalidade: " + frete.getModalidade());
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor do frete: " + moeda.format(valorFrete));
        System.out.println("Documentos: " + frete.getDocumentos());
        System.out.println();
    }
}
