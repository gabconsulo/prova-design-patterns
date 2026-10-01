import java.math.BigDecimal;

public final class FreteRodoviario implements Frete {
    @Override
    public BigDecimal calcularValor(BigDecimal valorCarga) {
        return valorCarga.multiply(new BigDecimal("0.02")).setScale(2);
    }
    @Override
    public String getModalidade() { return "Rodoviario"; }
    @Override
    public String getDocumentos() { return "CT-e/MDF-e"; }
}
