package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static LocalInnerClassButton btnPrint = new LocalInnerClassButton("Print");

    public static void main(String[] args) {

       /* Gearbox mcLaren = new Gearbox(6);//Inner non static class
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);

        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));

        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));*/

//we can create local class (defined in the method)that implements that onClickListener
// we have defined and assign a instance of it to a button class

            class ClickListener implements LocalInnerClassButton.OnClickListener{

                public ClickListener(){//constructor
                    System.out.println("I've been attached");
                }

                @Override
                public void onClick(String title) {
                    System.out.println(title + " was clicked.");
                }
            }

            btnPrint.setOnClickListener(new ClickListener());
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
                    btnPrint.onClick();//is implemented from the @Override of upper interface
                    break;
            }
        }
//local class is applicable just for that block only. If we want to assign same object(several buttons on the screen several times)
//we are not using this class anywhere else
//anonymous classes are local classes just without name. They have to be declared and instantiated at the same time
 //and they are used only once. Often with android apps. Several buttons with different functionality
    }
}