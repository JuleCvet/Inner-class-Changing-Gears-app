package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static LocalInnerClassButton btnPrint = new LocalInnerClassButton("Print");

    public static void main(String[] args) {
//local class

         /*   class ClickListener implements LocalInnerClassButton.OnClickListener{

                public ClickListener(){//constructor
                    System.out.println("I've been attached");
                }

                @Override
                public void onClick(String title) {
                    System.out.println(title + " was clicked.");
                }
            }*/

//Anonymous class

            btnPrint.setOnClickListener(new LocalInnerClassButton.OnClickListener() {
                @Override
                public void onClick(String title) {//we have to implement this method
                    System.out.println(title + " was clicked");
                }
            });
            listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();//1.is implemented from the @Override of upper interface
                    break;              //2. is implemented by anonymous class with in the brackets as a parameter
            }
        }
//local class is applicable just for that block only. If we want to assign same object(several buttons on the screen several times)
//we are not using this class anywhere else
//anonymous classes are local classes just without name. They have to be declared and instantiated at the same time
 //and they are used only once. Often with android apps. Several buttons with different functionality
    }
}