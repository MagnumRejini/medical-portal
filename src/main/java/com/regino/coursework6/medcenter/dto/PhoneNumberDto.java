package com.regino.coursework6.medcenter.dto;

import com.regino.coursework6.medcenter.model.PhoneNumberEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PhoneNumberDto {
    private String number;

    public PhoneNumberDto(PhoneNumberEntity phoneNumber) {
        this.number = phoneNumber.getNumber();
    }
}

