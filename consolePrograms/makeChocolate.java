/*This program counts how many chocalate bars can be made out of a given amount of kilos. 
It will make as many large bars(5 kilos each) before making small bars (1 kilo each).*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Kilos: ");
  int kilos = scanner.nextInt();

  int remainder = kilos % 5;

  System.out.println("We can produce " + kilos / 5 + " big bar(s) and "+ remainder+ " small bar(s)" );
  }
  
}
