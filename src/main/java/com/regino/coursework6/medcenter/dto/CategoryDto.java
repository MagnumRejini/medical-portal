package com.regino.coursework6.medcenter.dto;

import com.regino.coursework6.medcenter.model.CategoryEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CategoryDto {

    private String title;
    private String logo;
    private String speciality;

    public CategoryDto(CategoryEntity category) {
        this.title = category.getTitle();
        this.logo = category.getLogo();
        this.speciality = category.getSpeciality();
    }
}
