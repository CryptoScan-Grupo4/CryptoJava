package Computador;

public class Setup {
    private Integer idSetup;
    private Integer fkComputador;
    private Integer fkSetor;
    private Integer fkComponente;
    private String statusSetup;

    public Setup (){

    }
    public Setup(Integer idSetup, Integer fkComputador, Integer fkSetor, Integer fkComponente, String statusSetup) {
        this.idSetup = idSetup;
        this.fkComputador = fkComputador;
        this.fkSetor = fkSetor;
        this.fkComponente = fkComponente;
        this.statusSetup = statusSetup;
    }

    public Integer getIdSetup() {
        return idSetup;
    }

    public void setIdSetup(Integer idSetup) {
        this.idSetup = idSetup;
    }

    public Integer getFkComputador() {
        return fkComputador;
    }

    public void setFkComputador(Integer fkComputador) {
        this.fkComputador = fkComputador;
    }

    public Integer getFkSetor() {
        return fkSetor;
    }

    public void setFkSetor(Integer fkSetor) {
        this.fkSetor = fkSetor;
    }

    public Integer getFkComponente() {
        return fkComponente;
    }

    public void setFkComponente(Integer fkComponente) {
        this.fkComponente = fkComponente;
    }

    public String getStatusSetup() {
        return statusSetup;
    }

    public void setStatusSetup(String statusSetup) {
        this.statusSetup = statusSetup;
    }

    @Override
    public String toString() {
        return "Setup{" +
                "idSetup=" + idSetup +
                ", fkComputador=" + fkComputador +
                ", fkSetor=" + fkSetor +
                ", fkComponente=" + fkComponente +
                ", statusSetup='" + statusSetup + '\'' +
                '}';
    }
}
