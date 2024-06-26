package uniandes.edu.co.proyecto.modelo;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PUNTOS_ATENCION")
public class PuntosAtencion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idPuntosAtencion;
/*
    @OneToMany(mappedBy = "puntosAtencion", cascade = CascadeType.ALL,orphanRemoval=true)
    private List<Transaccion> transacciones;*/

    private String nombre;

    private String tipo;
    
    private String locacion;

    public PuntosAtencion(){;}

    public PuntosAtencion(String nombre,String tipo,String locacion)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.locacion = locacion;
    }

    public Integer getIdPuntosAtencion(){
        return idPuntosAtencion;
    }
    /*
    public List<Transaccion> getTransacciones(){
        return transacciones;
    } 
 */
    public String getNombre(){
        return nombre;
    } 

    public String getTipo(){
        return tipo;
    } 

    public String getLocacion(){
        return locacion;
    } 

    public void setIdPuntosAtencion(Integer idPuntosAtencion){
        this.idPuntosAtencion = idPuntosAtencion;
    }
/*
    public void setTransacciones(List<Transaccion> transacciones){
        this.transacciones = transacciones;
    }
 */
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 

    public void setTipo(String tipo){
        this.tipo = tipo;
    } 

    public void setLocacion(String locacion){
        this.locacion = locacion;
    } 

}
