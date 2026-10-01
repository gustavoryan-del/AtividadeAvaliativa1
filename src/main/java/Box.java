
import java.util.HashMap;


public class Box {
    private String tipoServicoPermitido;
    private int numero;
    private int capacidadeMaxima;
    private Mecanico mecanicoAssociado;
    private String localizacao;
    private HashMap<Servico, OrdemServico> ordens;

    public Box(String tipoServicoPermitido, int numero, int capacidadeMaxima, String localizacao) {
        this.tipoServicoPermitido = tipoServicoPermitido;
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
    }

    public Box(String tipoServicoPermitido, int numero, int capacidadeMaxima, Mecanico mecanicoAssociado, String localizacao, HashMap<Servico, OrdemServico> ordens) {
        this.tipoServicoPermitido = tipoServicoPermitido;
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.mecanicoAssociado = mecanicoAssociado;
        this.localizacao = localizacao;
        this.ordens = ordens;
    }

    

    public Box() {
    }
    
    public void atribuirOrdemServico(Servico servico, OrdemServico ordem){
        if(ordem.getStatus().equalsIgnoreCase("aberta")){
            System.out.println("Operação inválida");
        } else {
            ordens.put(servico, ordem);
        }
    }
    
    public void exibirOrdens(){
        for (var ordem: ordens.entrySet() ){
            ordem.getValue().exibeOrdem();
        }
    }
    
    public void associarMecanico(Mecanico mecanico){
        this.mecanicoAssociado = mecanico;
    }
    
    

    public String getTipoServicoPermitido() {
        return tipoServicoPermitido;
    }

    public void setTipoServicoPermitido(String tipoServicoPermitido) {
        this.tipoServicoPermitido = tipoServicoPermitido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Mecanico getMecanicoAssociado() {
        return mecanicoAssociado;
    }

    public void setMecanicoAssociado(Mecanico mecanicoAssociado) {
        this.mecanicoAssociado = mecanicoAssociado;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public HashMap<Servico, OrdemServico> getOrdens() {
        return ordens;
    }

    public void setOrdens(HashMap<Servico, OrdemServico> ordens) {
        this.ordens = ordens;
    }
            
}
