package com.example.deveducatecore.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum OperationStageCode {
    BMW("Bmw"),
    LADA("Lada"),
    OPEL("Opel"),
    SUZUKI("Suzuki"),
    LINCOLN("Lincoln"),
    GYLEE("Gylee");

    public final String car;
}

