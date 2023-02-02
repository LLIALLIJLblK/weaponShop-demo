package com.example.deveducatecore.entity.operationBase;

import com.example.deveducatecore.enums.OperationStageCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OperationStage extends AbstractModel {
    int intStage;
    String operationStageName;
    OperationStageCode operationStageCode;

    public boolean equalStage(OperationStage operationStage) {
        if (this == operationStage) return true;
        if (operationStage == null || getClass() != operationStage.getClass()) return false;
        return this.operationStageName == operationStage.operationStageName;
    }

    public int hashCodeStage() {
        int newStage = operationStageName == null ? 0 : operationStageName.hashCode();
        newStage = 31 * intStage;
        return newStage;
    }


    @Override
    public void printInfo() {
        System.out.println(operationStageName + " " + operationStageCode);
    }

    @Override
    public void getInfoForPrint() {
        StringBuffer sbuff = new StringBuffer();
        System.out.println(sbuff.append("|" + intStage).append("|" + operationStageName).append("|" + operationStageCode));
    }


}


