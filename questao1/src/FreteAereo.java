import java.math.BigDecimal;

public final class FreteAereo implements Frete {
    @Override
    public BigDecimal calcularValor(BigDecimal valorCarga) {
        return valorCarga.multiply(new BigDecimal("0.06")).setScale(2);
    }
    @Override
    public String getModalidade() { return "Aereo"; }
    @Override
    public String getDocumentos() { return "AWB"; }
}
