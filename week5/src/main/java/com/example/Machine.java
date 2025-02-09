package com.example;

public class Machine {
    private String type;
    private String model;
    private Worker worker;


    public Machine(String type, String model, Worker worker) {
        this.type = type;
        this.model = model;
        this.worker = worker;
    }

    public String getMachineDetails() {
        return "Koneen tiedot: " + type + ", " + model + "\nTyöntekijän tiedot: " + worker.getWorkerName() + ", " + worker.getWorkerRole();
    }
    
}
