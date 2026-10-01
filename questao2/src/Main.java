public class Main {
    public static void main(String[] args) {
        Assinatura brasil = new Assinatura(new FabricaBrasil());
        Assinatura mexico = new Assinatura(new FabricaMexico());
        brasil.ativar();
        mexico.ativar();
    }
}
