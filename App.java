public class App {
  public static void main(String[] args) {
    Conta c1 = new Conta();
    Conta c2 = new Conta();

    c1.setNumero(31);
    c2.setNumero(38);

    c1.depositar(500);
    c1.transferir(200, c2);

    System.out.printf("Saldo da conta %d: %.2f\n", c1.getNumero(), c1.getSaldo());
    System.out.printf("Saldo da conta %d: %.2f\n", c2.getNumero(), c2.getSaldo());
  }
}
