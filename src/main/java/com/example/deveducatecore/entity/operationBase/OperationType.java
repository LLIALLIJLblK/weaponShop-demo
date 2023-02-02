package com.example.deveducatecore.entity.operationBase;


import com.example.deveducatecore.enums.OperationTypeCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class OperationType extends AbstractModel {
    public static final String OPERATION_TYPE_STR = "Operation type";
    public static final String ORDER_INDEX_STR = "Index oreder";

    List<OperationStage> operationStageList;
    HashMap<String, OperationTypeCode> mapInfo;

    OperationTypeCode operationTypeCode;
    int orderIndex;
    String operationTypeName;

    public boolean equaType(OperationType operationType) {
        if (this == operationType) return true;
        if (operationType == null || getClass() != operationType.getClass()) return false;
        return this.operationTypeName == operationType.operationTypeName;
    }

    public int hashCodeType() {
        int newType = operationTypeName == null ? 0 : operationTypeName.hashCode();
        newType = 31 * orderIndex;
        return newType;
    }


    public void printInfo(long id, String operationTypeName, int orderIndex) {
        System.out.println(OPERATION_TYPE_STR + ": " + operationTypeName + ", " + ORDER_INDEX_STR + ": " + orderIndex);
    }

    public void addOrderIndex(int orderIndex, boolean useIfBlockInsteadSwitch, int index) {
        if (useIfBlockInsteadSwitch) {
            if (orderIndex % 3 == 0) {
                System.out.println(orderIndex + index);
            } else if (orderIndex % 3 == 1) {
                System.out.println(orderIndex - index);
            } else if (orderIndex % 3 == 2) {
                if (index >= 0) {
                    System.out.println(orderIndex * index);
                } else {
                    System.out.println(orderIndex * (-index));
                }
            }
        } else {
            switch (orderIndex % 3) {
                case (0) -> System.out.println(orderIndex + index);
                case (1) -> System.out.println(orderIndex - index);
                case (2) -> System.out.println(orderIndex * Math.abs(index));
                default -> System.out.println("None");

            }
        }
    }


    @Override
    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(operationTypeCode) + " " + stringBuilder.append(orderIndex) + " " + stringBuilder.append(operationTypeName));
    }

    @Override
    public void getInfoForPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("|" + operationTypeCode);
        sb.append("|" + orderIndex);
        sb.append("|" + operationTypeName);
        sb.append("|" + operationStageList.get(2).hashCode());
        sb.append("|" + mapInfo.get("001").getDay());

        System.out.println(sb.toString());
    }
}

