package com.regino.coursework6.medcenter.dto;

import com.regino.coursework6.medcenter.model.ServiceEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ServiceDto {

    private String title;
    private float price;
    private CategoryDto category;

    public ServiceDto(ServiceEntity service) {
        this.title = service.getTitle();
        this.price = service.getPrice();
        this.category = new CategoryDto(service.getCategory());
    }
}
