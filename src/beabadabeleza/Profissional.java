
package beabadabeleza;

/**
 *
 * @author letic
 */
public class Profissional {
      public String nome;
    public String cpf;
    public String especialidade;
    public String statusAprovacao;
    public Profissional(String nome, String cpf, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.statusAprovacao = "Pendente"; // Status inicial conforme seus requisitos
    }
}
