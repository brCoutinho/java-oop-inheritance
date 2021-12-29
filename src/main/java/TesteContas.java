public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente contaCorrente =  new ContaCorrente(121, 2343421);
        contaCorrente.deposita(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(222, 2224542);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(10.0, contaPoupanca);

        System.out.println("CC " + contaCorrente.getSaldo());
        System.out.println("CP " + contaPoupanca.getSaldo());
    }
}
