public class Conta {
  private int numero;
  private double saldo = 100;

  public Conta() {
    
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public double getSaldo() {
    return saldo;
  }
  

  // Method for withdrawing the money
  public void sacar(double valor) {
    if (this.saldo >= valor) {
      this.saldo = saldo - valor;
      String s = "Saldo atual: R$" + this.saldo;
      System.out.println(s);
    } else {
      String s = "Valor que deseja sacar não está disponível, você tem em conta R$" + this.saldo;

      System.out.println(s);
    }
  }

  
  public void depositar(double valor) {
    saldo = saldo + valor;
  }

  public void transferir(double valor, Conta destino) {
    if (saldo>=valor) {
      saldo = saldo - valor;

      destino.depositar(valor);
    } else System.out.printf("Valor indisponível!\n");
  }

  public static void main(String args[]) {
    Conta c1 = new Conta();
    Conta c2 = new Conta();

    c1.setNumero(31);
    c2.setNumero(38);
    c1.depositar(500);
    c1.transferir(200, c2);

    System.out.printf("Saldo da conta %d: %.2f\n", c1.numero, c1.saldo);
    System.out.printf("Saldo da conta %d: %.2f\n", c2.numero, c2.saldo);
  
  }
}
