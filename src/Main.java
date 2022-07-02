public class Main {
  public static void main(String[] args) {
    Conta conta = new ContaCorrente();
    Conta poupança = new ContaCorrente();

    conta.depositar(100);
    conta.transferir(100, poupança);

    conta.imprimirExtrato();
    poupança.imprimirExtrato();
  }
}
