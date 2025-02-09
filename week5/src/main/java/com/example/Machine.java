package com.example;

public class Machine {
    private String name;
    private String model;
    private Worker worker;


    public Machine(String name, String model, Worker worker) {
        this.name = name;
        this.model = model;
        this.worker = worker;
    }

    public String getMachineDetails() {
        return "Koneen tiedot: " + name + ", " + model + "\nTyöntekijän tiedot: " + worker.getWorkerName() + ", " + worker.getWorkerRole();
    }
    
}
