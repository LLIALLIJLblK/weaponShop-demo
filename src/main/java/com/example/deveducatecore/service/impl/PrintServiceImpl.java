package com.example.deveducatecore.service.impl;

import com.example.deveducatecore.service.PrintService;

public class PrintServiceImpl implements PrintService {

    @Override
    public void printInfo() {
        System.out.println("Nudle");
    }

    @Override
    public void getInfoForPrint() {
        System.out.println("Company from America" + "\n" + "State California");
    }
}
