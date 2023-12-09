package oop5_java;


import oop5_java.controller.Controller;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.createStudent("Иван", "Чернигов", "Сергеевич");
        controller.createStudent("Ирина", "Иванова", "Валерьевна");
        controller.createStudent("Сергей", "Юрьевич", "Павлович");
        controller.createStudent("Юрий", "Петров", "Сергеевич");

        System.out.println();

        controller.createTeacher("Наталья", "Костина", "Павловна");
        controller.createTeacher("Юлия", "Чернышева", "Ивановна");

        controller.formGroup();

    }
}
