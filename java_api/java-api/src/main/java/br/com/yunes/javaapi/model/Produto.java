package br.com.yunes.javaapi.model;

public class Produto {

    //#region Atributes

        private Integer id;

        private String name;

        private Double value;

        private Integer quantity;

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
