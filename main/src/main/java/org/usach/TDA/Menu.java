package org.usach.TDA;

public class Menu {
    private int option;

    public Menu(int option) {
        this.option = option;
    }


    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public void displayMainMenu(){
        System.out.println("Menú de Imágenes: ");
        System.out.println("Por favor, escoja su preferencia:");
        System.out.println("1. Crear imagen" +
                "2. Modificar imagen" +
                "3. Visualizar imagen");
    }

}

