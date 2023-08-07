package Entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @OneToOne
    private Sucursal sucursal;

    @Temporal(TemporalType.DATE)
    private Date fechaRecibido;

    @Temporal(TemporalType.DATE)
    private Date fechaSolicitada;

    @Temporal(TemporalType.DATE)
    private Date fechaEnviado;

    private String solicitante;
    private String motivo;
    private String comentario;
    private String procedimiento;
    private Boolean estado;
    private Integer numeroReq;
    
    
    public Solicitud(Long id, Sucursal sucursal, Date fechaRecibido, Date fechaSolicitada, Date fechaEnviado,
            String solicitante, String motivo, String comentario, String procedimiento, Boolean estado,
            Integer numeroReq) {
        this.id = id;
        this.sucursal = sucursal;
        this.fechaRecibido = fechaRecibido;
        this.fechaSolicitada = fechaSolicitada;
        this.fechaEnviado = fechaEnviado;
        this.solicitante = solicitante;
        this.motivo = motivo;
        this.comentario = comentario;
        this.procedimiento = procedimiento;
        this.estado = estado;
        this.numeroReq = numeroReq;
    }


    public Solicitud() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Sucursal getSucursal() {
        return sucursal;
    }


    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    public Date getFechaRecibido() {
        return fechaRecibido;
    }


    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }


    public Date getFechaSolicitada() {
        return fechaSolicitada;
    }


    public void setFechaSolicitada(Date fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }


    public Date getFechaEnviado() {
        return fechaEnviado;
    }


    public void setFechaEnviado(Date fechaEnviado) {
        this.fechaEnviado = fechaEnviado;
    }


    public String getSolicitante() {
        return solicitante;
    }


    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }


    public String getMotivo() {
        return motivo;
    }


    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


    public String getComentario() {
        return comentario;
    }


    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    public String getProcedimiento() {
        return procedimiento;
    }


    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }


    public Boolean getEstado() {
        return estado;
    }


    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    public Integer getNumeroReq() {
        return numeroReq;
    }


    public void setNumeroReq(Integer numeroReq) {
        this.numeroReq = numeroReq;
    }

    

    

    
}
