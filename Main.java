/*
Partners: Jordan Tavernier 
Jacob was unable to complete due to sickness
Date: (9/22/20)
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int numr = r.nextInt(50)+1;
    System.out.println("The Random Number is: "+ numr);

  if(numr<25){
    while(numr >= 0){
      System.out.println(numr);
      numr--;}
      System.out.println("Ahoy Mateys!");}
  else if(numr>25 && numr<42){
    while (numr >=0){
      System.out.println(numr);
      numr--;}
      System.out.println("Cannonball!");}
      else{
        while(numr>=0){
          System.out.println(numr);
          numr--;}
          System.out.println("Blast Off!");}
  }
}