package org.usach.TDA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * La clase menu sirve para mostrar todas las opciones
 * y permitir que el usuario interactúe con objetos
 */
public class Menu {

    // sus atributos permiten conservar los objetos manipulados mientras el programa corre
    /**
     * imageList permite almacenar las imágenes
     */
    private List<Image_198538736_GuajardoArias> imageList;

    /**
     * pixlist permite disponer los pixeles para crear cada imagen y se vacía posterior a eso
     */
    private List<Pixel_198538736_GuajardoArias> pixlist;

    /**
     * similar a pixlist, colorList permite disponer los colores para crear cada pixel antes de usarlos en una imagen
     */
    private List<Color_198538736_GuajardoArias> colorList;

    /**
     * permite instanciar el menu y así trabajar con él
     */
    public Menu() {
        this.imageList = new ArrayList<>();
        this.pixlist = new ArrayList<>();
        this.colorList = new ArrayList<>();
        startImageList();
    }


    // los siguientes métodos permiten visualizar cada tipo de menu y elegir sus opciones de acuerdo a lo que
    // desee el usuario

    /**
     * Método que muestra el menú principal y sus interacciones
     */
    public void displayMainMenu(){
        int flag = 1;
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("---------------------------------------------");
            System.out.println("Menu de Imagenes: ");
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
                System.out.println("Gracias, vuelva pronto :x");
                flag = 0;
            }

        }while(flag!=0);

    }

    /**
     * Método que muestra el menú de creación y sus interacciones
     */
    public void creationMenu(){

        Scanner in = new Scanner(System.in);
        this.pixlist = new ArrayList<>();
        this.colorList = new ArrayList<>();

        System.out.println("Por favor, ingrese largo");
        int W = in.nextInt();
        System.out.println("Por favor, ingrese ancho");
        int H = in.nextInt();
        int H1 = 0;
        while (H1 < H){

            int W1 = 0;
            while (W1 < W){

                colorCreation();
                System.out.println("Por favor, ingrese la profundidad d (cualquier valor entero): ");
                int d = in.nextInt();
                Pixel_198538736_GuajardoArias pix = new Pixel_198538736_GuajardoArias(W1, H1, d, this.colorList.get(this.colorList.size()-1));
                //pix.printPix();
                this.pixlist.add(pix);
                W1++;
            }
            H1++;
        }

        this.colorList = new ArrayList<>();

        Image_198538736_GuajardoArias image = new Image_198538736_GuajardoArias(W, H, this.pixlist);
        this.imageList.add(image);
        System.out.println("---------------------------------------------");
    }

    /**
     * Método que muestra el menú de creación para el color y el pixel
     */
    public void colorCreation(){
        int option2;
        Scanner in = new Scanner(System.in);
        Color_198538736_GuajardoArias c;
        System.out.println("Por favor, elija el tipo de color:\n");
        System.out.println("1. Bit\n2. Hex\n3. RGB\nOpcion: ");
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
            System.out.println("Por favor, ingrese un valor para G (entre 0 y 255): ");
            g = in.nextInt();
            System.out.println("Por favor, ingrese un valor para B (entre 0 y 255): ");
            b = in.nextInt();
            c = new Color_198538736_GuajardoArias(r, g, b);
            this.colorList.add(c);
        }
    }

    /**
     * Método que muestra el menú de modificaciones y sus interacciones
     */
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
            System.out.println("En estos momentos, hay " + this.imageList.size() + " imagenes creadas");
            int position = in.nextInt();
            if(position > this.imageList.size()){
                System.out.println("---------------------------------------------");
                System.out.println("ERROR404 IMAGE NOT FOUND - RETURNING TO BASE");
                System.out.println("---------------------------------------------");
            }
            else {
                System.out.println("Has elegido la imagen:");
                imageList.get(position-1).printImage();
                Image_198538736_GuajardoArias newImage;
                System.out.println("Por favor, elija la modificacion que quiere hacer a la imagen:");
                System.out.println("1. Voltear horizontalmente\n2. Voltear verticalmente\n3. Crop\n4. rgbToHex\n5. rotate90°\n6. Volver al menu principal");
                int option = in.nextInt();
                if(option == 1){
                    newImage = this.imageList.get(position-1).flipH();
                    this.imageList.add(newImage);
                    this.imageList.get(this.imageList.size()-1).printImage();
                } else if (option == 2) {

                    newImage = imageList.get(position-1).flipV();
                    this.imageList.add(newImage);
                    this.imageList.get(imageList.size()-1).printImage();
                } else if (option == 3) {
                    System.out.println("Por favor, elija un x1 como posicion delimitante de x");
                    int x1 = in.nextInt();
                    System.out.println("Por favor, elija un y1 como posicion delimitante de y");
                    int y1 = in.nextInt();
                    System.out.println("Por favor, elija un x2 como segunda posicion delimitante de x");
                    int x2 = in.nextInt();
                    System.out.println("Por favor, elija un y2 como segunda posicion delimitante de y");
                    int y2 = in.nextInt();
                    newImage = this.imageList.get(position-1).crop(x1, y1, x2, y2);
                    newImage.printImage();
                    this.imageList.add(newImage);
                } else if (option == 4) {
                    if(this.imageList.get(position-1).isPixmap()){
                        this.imageList.add(this.imageList.get(position-1).imgRGBToHex());
                        this.imageList.get(position-1).imgRGBToHex().printImage();
                    }
                    else{
                        System.out.println("DEBE SER UNA IMAGEN RGB PARA SER CONVERTIDA A HEX :P");
                    }

                } else if (option == 5) {
                    this.imageList.add(this.imageList.get(position-1).rotate90());
                    this.imageList.get(position-1).rotate90().printImage();
                } else if (option==6) {
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



    }

    /**
     * Método que muestra el menú de visualización y sus interacciones
     */
    public void visualizationMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, ingrese la imagen que quiere visualizar");
        System.out.println("(Si quiere visualizar la 3era, ingrese 3 y siga esa lógica)");
        System.out.println("En estos momentos, hay " + this.imageList.size() + " imagenes creadas");
        int option = in.nextInt();
        if(option-1 >= imageList.size()){
            System.out.println("ERROR404 IMAGE NOT FOUND");
        }
        else{
            System.out.println("Por favor, elija la opcion para visualizar su imagen:\n1. Imagen\n2. Histograma");
            int option2 = in.nextInt();
            if (option2 == 1){
                this.imageList.get(option-1).printImage();
            } else if (option2 == 2) {

                this.imageList.get(option-1).histogram();
            }
            else{
                System.out.println("---------------------------------------------");
                System.out.println("FATAL ERROR, RETURNING TO MAIN MENU");
                System.out.println("---------------------------------------------");
            }
        }



    }

    /**
     * Método que crea y agrega los pixeles por defecto a la lista
     */
    void startImageList(){
        // AQUI EMPIEZO A HACER LOS PIXELES DE PRUEBA
        Color_198538736_GuajardoArias myColor1 = new Color_198538736_GuajardoArias(1, 244, 255);
        Color_198538736_GuajardoArias myColor2 = new Color_198538736_GuajardoArias(1, 244, 255);
        Color_198538736_GuajardoArias myColor3 = new Color_198538736_GuajardoArias(24, 26, 21);
        Color_198538736_GuajardoArias myColor4 = new Color_198538736_GuajardoArias(1, 1, 1);
        Color_198538736_GuajardoArias myColor5 = new Color_198538736_GuajardoArias("#05F6AB");
        Color_198538736_GuajardoArias myColor6 = new Color_198538736_GuajardoArias("#01F4FF");
        Color_198538736_GuajardoArias myColor7 = new Color_198538736_GuajardoArias("#10F8CD");
        Color_198538736_GuajardoArias myColor8 = new Color_198538736_GuajardoArias("#013AEA");
        Color_198538736_GuajardoArias myColor9 = new Color_198538736_GuajardoArias(1);
        Color_198538736_GuajardoArias myColor10 = new Color_198538736_GuajardoArias(0);
        Color_198538736_GuajardoArias myColor11 = new Color_198538736_GuajardoArias(1);
        Color_198538736_GuajardoArias myColor12 = new Color_198538736_GuajardoArias(0);

        // AQUI CREO LAS LISTAS DE PIXELES PARA CONSTRUIR IMAGENES DESPUES
        // RGB
        List<Pixel_198538736_GuajardoArias> pixList2 = new ArrayList<Pixel_198538736_GuajardoArias>();
        Pixel_198538736_GuajardoArias PA = new Pixel_198538736_GuajardoArias(0, 0, 1, myColor1);
        Pixel_198538736_GuajardoArias PB = new Pixel_198538736_GuajardoArias(1, 0, 2, myColor2);
        Pixel_198538736_GuajardoArias PC = new Pixel_198538736_GuajardoArias(0, 1, 1, myColor3);
        Pixel_198538736_GuajardoArias PD = new Pixel_198538736_GuajardoArias(1, 1, 1, myColor4);
        pixList2.add(PA);
        pixList2.add(PB);
        pixList2.add(PC);
        pixList2.add(PD);
        Image_198538736_GuajardoArias myImage = new Image_198538736_GuajardoArias(2, 2, pixList2);
        this.imageList.add(myImage);
        // HEX
        List<Pixel_198538736_GuajardoArias> pixList3 = new ArrayList<Pixel_198538736_GuajardoArias>();
        Pixel_198538736_GuajardoArias PE = new Pixel_198538736_GuajardoArias(0, 0, 1, myColor5);
        Pixel_198538736_GuajardoArias PF = new Pixel_198538736_GuajardoArias(1, 0, 1, myColor6);
        Pixel_198538736_GuajardoArias PG = new Pixel_198538736_GuajardoArias(0, 1, 1, myColor7);
        Pixel_198538736_GuajardoArias PH = new Pixel_198538736_GuajardoArias(1, 1, 1, myColor8);
        pixList3.add(PE);
        pixList3.add(PF);
        pixList3.add(PG);
        pixList3.add(PH);
        Image_198538736_GuajardoArias myImage3 = new Image_198538736_GuajardoArias(2, 2, pixList3);
        this.imageList.add(myImage3);
        // BIT
        List<Pixel_198538736_GuajardoArias> pixList4 = new ArrayList<Pixel_198538736_GuajardoArias>();
        Pixel_198538736_GuajardoArias PX = new Pixel_198538736_GuajardoArias(0, 0, 1, myColor9);
        Pixel_198538736_GuajardoArias PY = new Pixel_198538736_GuajardoArias(1, 0, 1, myColor10);
        Pixel_198538736_GuajardoArias PZ = new Pixel_198538736_GuajardoArias(0, 1, 1, myColor11);
        Pixel_198538736_GuajardoArias PW = new Pixel_198538736_GuajardoArias(1, 1, 1, myColor12);
        pixList4.add(PY);
        pixList4.add(PX);
        pixList4.add(PZ);
        pixList4.add(PW);
        Image_198538736_GuajardoArias myImage4 = new Image_198538736_GuajardoArias(2, 2, pixList4);
        this.imageList.add(myImage4);
    }

}

