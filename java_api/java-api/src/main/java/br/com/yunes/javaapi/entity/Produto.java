package br.com.yunes.javaapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

    //#region Atributes

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Integer id;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private Double value;

        @Column(nullable = false)
        private Integer quantity;

        @Column
        private String description;

    //#endregion 
    
    //#region Getters and Setters 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //#endregion

}