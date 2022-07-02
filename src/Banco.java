import java.util.List;

public class Banco {
  private String nome;
  private List<Cliente> listClients;

  public String getNome() {
    return nome;
  }

  public List<Cliente> getListClients() {
    return listClients;
  }

  public void setListClients(List<Cliente> listClients) {
    this.listClients = listClients;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  

  
}
