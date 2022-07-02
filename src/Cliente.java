public class Cliente {
  protected String nome;
  private ContaPoupanca contaPoupanca;
  private ContaCorrente contaCorrente;

  protected Cliente (ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
    this.contaCorrente = contaCorrente;
    this.contaPoupanca = contaPoupanca;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ContaPoupanca getContaPoupanca() {
    return this.contaPoupanca;
  }

  public void setContaPoupanca(ContaPoupanca contaPoupanca) {
    this.contaPoupanca = contaPoupanca;
  }

  public ContaCorrente getContaCorrente() {
    return this.contaCorrente;
  }

  public void setContaCorrente(ContaCorrente contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  
}
