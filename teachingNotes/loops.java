package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        //Forloop
        /*for (int i = 0; i < 5; i++){
            System.out.println("Hello, my name is Nathaniel!");
        }*/

        //While loop
       /* int i = 5;
        while (i > 0){
            System.out.println("Hello my name is Nathaniel");
            --i;
        }*/

        //Validating user input with While loops
        //While loops are good for when we don't know how many times we have to loop something
        /*Scanner scanner = new Scanner(System.in);
        String input = "";
        //while(!input.equals("quit")){
         /* while(true){
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
           if(input.equals("pass"))
               continue;
             if(input.equals("quit"))
               break;
            System.out.println(input);
        }*/
        //Validating user input with do While loops
       //Do while loops run at least once before checking the condition
      /*  String input = "";
        Scanner scanner = new Scanner(System.in);
       do{
           System.out.print("Input: ");
           input = scanner.nextLine().toLowerCase();
           if(input.equals("pass"))
               continue;
           if(input.equals("quit"))
               break;
           System.out.println(input);

       //} while (!input.equals("quit"));
       } while (true); */

      //For each loop
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
