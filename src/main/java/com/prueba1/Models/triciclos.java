package com.prueba1.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data

public class triciclos {
    //Atributos
    private Long id;
    private String Color;
    private Boolean Ruedasplasticas;
    private Boolean Canasta;

    public triciclos() {
        super();
    }

    public triciclos(Long id, String color, Boolean ruedasplasticas, Boolean canasta) {
        this.id = id;
        Color = color;
        Ruedasplasticas = ruedasplasticas;
        Canasta = canasta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Boolean getRuedasplasticas() {
        return Ruedasplasticas;
    }

    public void setRuedasplasticas(Boolean ruedasplasticas) {
        Ruedasplasticas = ruedasplasticas;
    }

    public Boolean getCanasta() {
        return Canasta;
    }

    public void setCanasta(Boolean canasta) {
        Canasta = canasta;
    }
}
