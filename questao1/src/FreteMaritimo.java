import java.math.BigDecimal;

public final class FreteMaritimo implements Frete {
    @Override
    public BigDecimal calcularValor(BigDecimal valorCarga) {
        return valorCarga.multiply(new BigDecimal("0.01")).setScale(2);
    }
    @Override
    public String getModalidade() { return "Maritimo"; }
    @Override
    public String getDocumentos() { return "BL/fatura comercial"; }
}
