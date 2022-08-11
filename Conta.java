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

  //método retirar
  
  public void depositar(double valor) {
    saldo = saldo + valor;
  }

  public void transfer(double valor, Conta destino) {
    if (saldo>=valor) {
      saldo = saldo - valor;

      destino.depositar(valor);
    } else System.out.printf("Valor indisponível!\n");
  }

  public static void main(String args[]) {
    Conta account1 = new Conta();
  }
}
