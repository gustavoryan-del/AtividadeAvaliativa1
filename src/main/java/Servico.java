
import java.time.LocalDate;
import java.util.Calendar;


public class Servico {
    private String nome;
    private double valor;
    private Calendar tempo;
    private String categoria;

    public Servico(String nome, double valor, Calendar tempo, String categoria) {
        this.nome = nome;
        this.valor = valor;
        this.tempo = tempo;
        this.categoria = categoria;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getTempo() {
        return tempo;
    }

    public void setTempo(Calendar tempo) {
        this.tempo = tempo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
