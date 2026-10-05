
package beabadabeleza;

/**
 *
 * @author letic
 */
public class Agendamento {
    public String data;
    public String horario;
    public Cliente cliente;
    public Profissional profissional;
    public Servico servico;
    public String status;
    public Agendamento(String data, String horario, Cliente cliente, Profissional profissional, Servico servico) {
        this.data = data;
        this.horario = horario;
        this.cliente = cliente;
        this.profissional = profissional;
        this.servico = servico;
        this.status = "Pendente";
    }
}
