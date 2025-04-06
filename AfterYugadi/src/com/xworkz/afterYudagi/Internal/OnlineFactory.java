package com.xworkz.afterYudagi.Internal;

public class OnlineFactory extends Factory {
    public OnlineFactory() {
        System.out.println("OnlineFactory Constructor");
    }
@Override
    public void produceItem() {
        System.out.println("Factory is producing an item");
    }
@Override
    public void inspectItem() {
        System.out.println("Factory is inspecting an item");
    }
@Override
    public void packageItem() {
        System.out.println("Factory is packaging an item");
    }
@Override
    public void shipItem() {
        System.out.println("Factory is shipping an item");
    }
@Override
    public void maintainEquipment() {
        System.out.println("Factory is maintaining equipment");
    }
}

