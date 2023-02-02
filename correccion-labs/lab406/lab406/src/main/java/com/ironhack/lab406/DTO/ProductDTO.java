package com.ironhack.lab406.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ProductDTO {
    @NotNull
    private Integer departmentId;
    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    private Integer quantity;

    public ProductDTO(Integer departmentId, String name, Integer quantity) {
        this.departmentId = departmentId;
        this.name = name;
        this.quantity = quantity;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
