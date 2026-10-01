
import java.time.LocalDate;


public class OrdemServico {
    private String codigo;
    private String nomeCliente;
    private String placaVeiculo;
    private String modeloVeiculo;
    private String data;
    private String status;
    private double valorEstimado;
    private Mecanico mecanico;
    private Box box;
    
    
    public OrdemServico() {
    }

    public void cadastrarOrdemServico(String codigo, String nomeCliente, String placaVeiculo, String modeloVeiculo, String data, String status, double valorEstimado, Mecanico mecanico, Box box) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.placaVeiculo = placaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.data = data;
        this.status = status;
        this.valorEstimado = valorEstimado;
        this.mecanico = mecanico;
        this.box = box;
    }
    
    public void exibeOrdem(){
        System.out.println("----------------");
        System.out.println("codigo: " + this.codigo);
        System.out.println("Nome do Cliente: " + this.nomeCliente);
        System.out.println("Data: " + this.data);
    }
    public void exibirDetalhesCompleto(){
        System.out.println("------------------");
        System.out.println("codigo: " + this.codigo);
        System.out.println("Nome do Cliente: " + this.nomeCliente );
        System.out.println("Placa: " + this.placaVeiculo);
        System.out.println("Modelo: " + this.modeloVeiculo);
        System.out.println("Data: " + this.data);
        System.out.println("Status: " + this.status);
        System.out.println("Valor estimado:  " + this.valorEstimado);
        System.out.println("Mecânico: " + mecanico);
        System.out.println("Box: " + box);
    
    }
    
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }
    
    
    
}
