package com.example;

import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines = new ArrayList<Machine>();

    public Factory(String name) {
        this.name = name;
    }

    public void addMachine(Machine machine) {
        machines.add(machine);
    }

    public String getFactoryName() {
        return name;
    }
    public void getMachines() {
        for (Machine machine : machines) {
            System.out.println(machine.getMachineDetails());
        }
    }
}
