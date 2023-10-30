package Computador;

public class Componente {
    private Integer idComponente;
    private String modeloComponente;
    private String tipoComponente;
    private String serialComponente;

    public Componente (){}

    public Componente(Integer idComponente, String modeloComponente, String tipoComponente, String serialComponente) {
        this.idComponente = idComponente;
        this.modeloComponente = modeloComponente;
        this.tipoComponente = tipoComponente;
        this.serialComponente = serialComponente;
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public String getModeloComponente() {
        return modeloComponente;
    }

    public void setModeloComponente(String modeloComponente) {
        this.modeloComponente = modeloComponente;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public String getSerialComponente() {
        return serialComponente;
    }

    public void setSerialComponente(String serialComponente) {
        this.serialComponente = serialComponente;
    }


    @Override
    public String toString() {
        return "Computador.Componente{" +
                "idComponente=" + idComponente +
                ", modeloComponente='" + modeloComponente + '\'' +
                ", tipoComponente='" + tipoComponente + '\'' +
                ", serialComponente='" + serialComponente + '\'' +
                '}';
    }
}
