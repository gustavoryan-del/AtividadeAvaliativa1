
public class Mecanico {
    private String cpf;
    private String especialidade;
    private String telefone;
    private String nome;

    public Mecanico(String cpf, String especialidade, String telefone, String nome) {
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.telefone = telefone;
        this.nome = nome;
    }

    public Mecanico() {
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
