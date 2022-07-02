import java.util.Arrays;
import java.util.List;


public class Main {
  public static void main(String[] args) {
    ContaCorrente contaCorrente = new ContaCorrente();
    ContaPoupanca poupanca = new ContaPoupanca();
    Banco banco = new Banco();

    contaCorrente.depositar(100);
    contaCorrente.transferir(100, poupanca);

    contaCorrente.imprimirExtrato();
    poupanca.imprimirExtrato();

    Cliente roberto = new Cliente(contaCorrente, poupanca);
    Cliente roberta = new Cliente(new ContaCorrente(), new ContaPoupanca());
    Cliente gerisvaldo = new Cliente(new ContaCorrente(), new ContaPoupanca());

    roberto.setNome("Roberto");
    roberta.setNome("Roberta");
    gerisvaldo.setNome("Gerisvaldo");
    
    List <Cliente> clientList = Arrays.asList(
      roberto,
      roberta,
      gerisvaldo  
    );

    banco.setListClients(clientList);

    banco.getListClients().stream().forEach(client -> System.out.println(client.nome));
  }
}
