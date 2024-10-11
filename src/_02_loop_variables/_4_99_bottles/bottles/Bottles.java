package _02_loop_variables._4_99_bottles.bottles;

public class Bottles {
    public static void main(String[] args) {
   for(int bottles=99; bottles >1; bottles--){
   System.out.println( bottles +" bottles of beer on the wall, " + bottles +" bottles of beer.");
   System.out.println( "Take one down and pass it around, " + (bottles-1)+ " bottles of beer on the wall.");
   
   
   }
   System.out.println( "1 bottle of beer on the wall, 1 bottle of beer.\n" 
   + "Take one down and pass it around, no more bottles of beer on the wall.\n" 
   + "No more bottles of beer on the wall, no more bottles of beer.\n"
   +" Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
/*/1 bottle of beer on the wall, 1 bottle of beer.
Take one down and pass it around, no more bottles of beer on the wall.
No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall.
*/
}
