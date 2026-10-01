import java.util.Objects;

public final class Assinatura {
    private final ComprovanteFiscal comprovante;
    private final Pagamento pagamento;
    private final TermoPrivacidade termo;

    public Assinatura(FabricaAssinatura fabrica) {
        Objects.requireNonNull(fabrica, "A fábrica é obrigatória.");
        this.comprovante = fabrica.criarComprovanteFiscal();
        this.pagamento = fabrica.criarPagamento();
        this.termo = fabrica.criarTermoPrivacidade();
    }

    public void ativar() {
        System.out.println("Assinatura ativada:");
        System.out.println("Fiscal: " + comprovante.descrever());
        System.out.println("Pagamento: " + pagamento.descrever());
        System.out.println("Privacidade: " + termo.descrever());
        System.out.println();
    }
}
