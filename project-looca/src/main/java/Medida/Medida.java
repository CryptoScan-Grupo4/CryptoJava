package Medida;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Medida {
    private Integer idMedida;
    private Float usoProcessador;
    private Float usoRam;
    private Float usoDisco;
    private DateTimeFormatter dataMedida;
    private String unidadeMedida;
    private Integer fkSetor;
    private Integer fkComponente;

    public Medida (){}

    public Medida(Integer idMedida, Float usoProcessador, Float usoRam, Float usoDisco, DateTimeFormatter dataMedida, String unidadeMedida, Integer fkSetor, Integer fkComponente) {
        this.idMedida = idMedida;
        this.usoProcessador = usoProcessador;
        this.usoRam = usoRam;
        this.usoDisco = usoDisco;
        this.dataMedida = dataMedida;
        this.unidadeMedida = unidadeMedida;
        this.fkSetor = fkSetor;
        this.fkComponente = fkComponente;
    }

    public Integer getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(Integer idMedida) {
        this.idMedida = idMedida;
    }

    public Float getUsoProcessador() {
        return usoProcessador;
    }

    public void setUsoProcessador(Float usoProcessador) {
        this.usoProcessador = usoProcessador;
    }

    public Float getUsoRam() {
        return usoRam;
    }

    public void setUsoRam(Float usoRam) {
        this.usoRam = usoRam;
    }

    public Float getUsoDisco() {
        return usoDisco;
    }

    public void setUsoDisco(Float usoDisco) {
        this.usoDisco = usoDisco;
    }

    public DateTimeFormatter getDataMedida() {
        return dataMedida;
    }

    public void setDataMedida(DateTimeFormatter dataMedida) {
        this.dataMedida = dataMedida;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
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

    @Override
    public String toString() {
        return "Medida{" +
                ", usoProcessador=" + usoProcessador +
                ", usoRam=" + usoRam +
                ", usoDisco=" + usoDisco +
                '}';
    }
}
