package pe.edu.upeu.msproducto.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data

public class ProductoDto {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public CatagoriaDto getCatagoria() {
        return catagoria;
    }

    public void setCatagoria(CatagoriaDto catagoria) {
        this.catagoria = catagoria;
    }

    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer idCategoria;
    private CatagoriaDto catagoria;

}
