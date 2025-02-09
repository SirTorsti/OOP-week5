package com.example;

public class Machine {
    private String type;
    private String model;
    private Worker operator;


    public Machine(String type, String model, Worker worker) {
        this.type = type;
        this.model = model;
        this.operator = worker;
    }

    public String getMachineDetails() {
        return "Koneen tiedot: " + type + ", " + model + "\nTyöntekijän tiedot: " + operator.getWorkerName() + ", " + operator.getWorkerRole();
    }
    
}
