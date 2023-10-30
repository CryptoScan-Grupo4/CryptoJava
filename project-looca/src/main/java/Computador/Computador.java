package Computador;

public class Computador {
    private Integer idComputador;
    private Integer fkSetor;
    private Integer fkFuncionario;
    private Integer fkTipoConta;
    private String serialComputador;


    public Computador (){}

    public Computador(Integer idComputador, Integer fkSetor, Integer fkFuncionario, Integer fkTipoConta, String serialComputador) {
        this.idComputador = idComputador;
        this.fkSetor = fkSetor;
        this.fkFuncionario = fkFuncionario;
        this.fkTipoConta = fkTipoConta;
        this.serialComputador = serialComputador;
    }

    public Integer getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(Integer idComputador) {
        this.idComputador = idComputador;
    }

    public Integer getFkSetor() {
        return fkSetor;
    }

    public void setFkSetor(Integer fkSetor) {
        this.fkSetor = fkSetor;
    }

    public Integer getFkFuncionario() {
        return fkFuncionario;
    }

    public void setFkFuncionario(Integer fkFuncionario) {
        this.fkFuncionario = fkFuncionario;
    }

    public Integer getFkTipoConta() {
        return fkTipoConta;
    }

    public void setFkTipoConta(Integer fkTipoConta) {
        this.fkTipoConta = fkTipoConta;
    }

    public String getSerialComputador() {
        return serialComputador;
    }

    public void setSerialComputador(String serialComputador) {
        this.serialComputador = serialComputador;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "idComputador=" + idComputador +
                ", fkSetor=" + fkSetor +
                ", fkFuncionario=" + fkFuncionario +
                ", fkTipoConta=" + fkTipoConta +
                ", serialComputador='" + serialComputador + '\'' +
                '}';
    }
}
