package com.xworkz.afterYudagi.Internal;
public class Factory {
    public Factory() {
        System.out.println("Factory Constructor");
    }

    public void produceItem() {
        System.out.println("Factory is producing an item");
    }

    public void inspectItem() {
        System.out.println("Factory is inspecting an item");
    }

    public void packageItem() {
        System.out.println("Factory is packaging an item");
    }

    public void shipItem() {
        System.out.println("Factory is shipping an item");
    }

    public void maintainEquipment() {
        System.out.println("Factory is maintaining equipment");
    }
}
