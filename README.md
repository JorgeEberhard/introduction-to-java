# introduction-to-java

Considering the following code:  

```
public class Conta {
       private int numero;
       private double saldo;
       public Conta(){    
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
       //método retirar
       public void depositar(double valor){
             saldo = saldo + valor;
       }
       public void transferir(double valor, Conta destino){
             if(saldo>=valor){
                    saldo = saldo - valor;
                    destino.depositar(valor);
             }else System.out.printf("Valor indisponível!\n");
       }
}

```

1. Create a function for withdrawing the money from the account.  

Considering the next code:  

```
public class Conta {

   private int numero;

   private double saldo;

   public Conta(){    

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

   //método retirar

   public void depositar(double valor){

          saldo = saldo + valor;
   }

   public void transferir(double valor, Conta destino){

          if(saldo>=valor){

                 saldo = saldo - valor;

                 destino.depositar(valor);

          }else System.out.printf("Valor indisponível!\n");
   }

public static void main(String args[]){

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

```
  
2. What is the output of execution of the class?  
- Answer: The output of the execution of the class is the amount of money in each account (31, 38) being 400(31) and 300(38).  

3. Knowing that the class "Conta" wont have a proposed main method, create a class "App", in which should stay only with the "main" method. Make the rigth ajustments to the output still be the same.
- Answer: Changes have been made and the output still the same.
