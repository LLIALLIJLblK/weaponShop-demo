package com.example.deveducatecore.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum OperationTypeCode {
    MONDAY("TODAY IS MONDAY"),
    TUESDAY("TODAY IS TUESDAY"),
    WEDNESDAY("TODAY IS WEDNESDAY"),
    THURSDAY("TODAY IS THURSDAY"),
    FRIDAY("TODAY IS FRIDAY"),
    SATURDAY("TODAY IS SATURDAY"),
    SUNDAY("TODAY IS SUNDAY");

    public final String day;

}
