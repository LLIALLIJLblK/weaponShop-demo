package com.example.deveducatecore.entity.operationBase;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class AbstractModel {
    Long id;

    public abstract void printInfo();

    public abstract void getInfoForPrint();


}
