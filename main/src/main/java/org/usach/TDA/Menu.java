package org.usach.TDA;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private List<Image_198538736_GuajardoArias> imageList;

    private List<Pixel_198538736_GuajardoArias> pixlist;

    private List<Color_198538736_GuajardoArias> colorList;

    public Menu(int option) {
        this.imageList = new ArrayList<>();
        this.pixlist = new ArrayList<>();
        this.colorList = new ArrayList<>();
    }


    public void displayMainMenu(){
        int flag = 1;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("---------------------------------------------");
            System.out.println("Menú de Imágenes: ");
            System.out.println("Por favor, escoja su preferencia:");
            System.out.println("1. Crear imagen\n" +
                    "2. Modificar imagen\n" +
                    "3. Visualizar imagen\n" +
                    "4. Salir");
            int option = in.nextInt();
            if(option == 1){
                creationMenu();
            } else if (option == 2) {
                modMenu();
            } else if (option == 3) {
                visualizationMenu();
            }
            else{
                System.out.println("Gracias, vuelva pronto 😎");
                flag = 0;
            }

        }while(flag!=0);

    }
    public void creationMenu(){

        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, ingrese largo");
        int W = in.nextInt();
        System.out.println("Por favor, ingrese ancho");
        int H = in.nextInt();
        int H1 = 0;
        while (H1 < H){
            System.out.println("ENTRÓ AL PRIMERO");
            int W1 = 0;
            while (W1 < W){
                System.out.println("ENTRÓ AL SEGUNDO");
                colorCreation();
                System.out.println("Por favor, ingrese la profundidad d (cualquier valor entero): ");
                int d = in.nextInt();
                Pixel_198538736_GuajardoArias pix = new Pixel_198538736_GuajardoArias(W1, H1, d, this.colorList.get(H1+W1));
                //pix.printPix();
                this.pixlist.add(pix);
                W1++;
            }
            H1++;
        }

        List<Color_198538736_GuajardoArias> newColorList = new ArrayList<>();
        this.colorList = newColorList;

        Image_198538736_GuajardoArias image = new Image_198538736_GuajardoArias(W, H, this.pixlist);
        imageList.add(image);
        System.out.println("---------------------------------------------");
    }

    public void colorCreation(){
        int option2;
        Scanner in = new Scanner(System.in);
        Color_198538736_GuajardoArias c;
        System.out.println("Por favor, elija el tipo de color:\n");
        System.out.println("1. Bit\n2.Hex\n3.RGB\nOpcion: ");
        option2 = in.nextInt();
        if (option2 == 1){
            int bit;
            System.out.println("Por favor, ingrese un valor para el bit (1|0): ");
            bit = in.nextInt();
            c = new Color_198538736_GuajardoArias(bit);
            this.colorList.add(c);
        } else if (option2 == 2) {
            String hex;
            System.out.println("Por favor, ingrese un valor para el valor hex (por ejemplo #1234A6): ");
            hex = in.nextLine();
            c = new Color_198538736_GuajardoArias(hex);
            this.colorList.add(c);
        } else if (option2 == 3) {
            int r, g, b;
            System.out.println("Por favor, ingrese un valor para R (entre 0 y 255): ");
            r = in.nextInt();
            System.out.println("Por favor, ingrese un valor para R (entre 0 y 255): ");
            g = in.nextInt();
            System.out.println("Por favor, ingrese un valor para R (entre 0 y 255): ");
            b = in.nextInt();
            c = new Color_198538736_GuajardoArias(r, g, b);
            this.colorList.add(c);
        }
    }

    public void modMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, ingrese la imagen que quiere modificar");
        System.out.println("(Si quiere visualizar la 3era, ingrese 3 y siga esa lógica)");


        if(imageList.size() == 0){
            System.out.println("---------------------------------------------");
            System.out.println("ERROR404 IMAGE NOT FOUND - RETURNING TO BASE");
            System.out.println("---------------------------------------------");
        }
        else{
            System.out.println("En estos momentos, hay " + imageList.size() + " imagenes creadas");
            int position = in.nextInt();
            System.out.println("Por favor, elija la modificacion que quiere hacer a la imagen:");
            System.out.println("1. Voltear horizontalmente\n2. Voltear verticalmente\n3. Crop\n4. rotate90°\n5. Volver al menu principal");
            int option = in.nextInt();
            if(option == 1){
                imageList.get(position).flipH();
                imageList.get(position).printImage();
            } else if (option == 2) {
                imageList.get(position).flipV();
                imageList.get(position).printImage();
            } else if (option == 3) {
                System.out.println("Por favor, elija un x1 como posicion delimitante de x");
                int x1 = in.nextInt();
                System.out.println("Por favor, elija un y1 como posicion delimitante de y");
                int y1 = in.nextInt();
                System.out.println("Por favor, elija un x2 como segunda posicion delimitante de x");
                int x2 = in.nextInt();
                System.out.println("Por favor, elija un y2 como segunda posicion delimitante de y");
                int y2 = in.nextInt();
                imageList.get(position).crop(x1, y1, x2, y2);
                imageList.get(position).printImage();
            } else if (option == 4) {
                System.out.println("Aun no esta implementado lol");
            } else if (option==5) {
                System.out.println("---------------------------------------------");
                System.out.println("Volviendo al menu...");
                System.out.println("---------------------------------------------");
            }
            else {
                System.out.println("---------------------------------------------");
                System.out.println("FATAL ERROR, RETURNING TO MAIN MENU");
                System.out.println("---------------------------------------------");
            }
        }



    }

    public void visualizationMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, ingrese la imagen que quiere visualizar");
        System.out.println("(Si quiere visualizar la 3era, ingrese 3 y siga esa lógica)");
        System.out.println("En estos momentos, hay " + imageList.size() + " imagenes creadas");
        int option = in.nextInt();
        if(option-1 >= imageList.size()){
            System.out.println("ERROR404 IMAGE NOT FOUND");
        }
        else{
            imageList.get(option-1).printImage();
        }
    }

}

