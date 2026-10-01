import java.math.BigDecimal;

public interface Frete {
    BigDecimal calcularValor(BigDecimal valorCarga);
    String getModalidade();
    String getDocumentos();
}
