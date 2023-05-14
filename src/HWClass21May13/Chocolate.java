package HWClass21May13;

public class Chocolate {

String name;
String color;
int numberOfIngredients;

 public Chocolate(String name, String color, int numberOfIngredients) {
  this.name = name;
  this.color = color;
  this.numberOfIngredients = numberOfIngredients;
 }
 void taste (){

  System.out.println("Chocolates are delicious");
 }

 void printInfo(){
  System.out.println(name+" "+color+" "+numberOfIngredients);
 }

}
class darkChocolate extends Chocolate{

 public darkChocolate(String name, String color, int numberOfIngredients) {
  super(name, color, numberOfIngredients);
 }

 void taste (){

  System.out.println("Dark Chocolate is bitter sweet");
 }

}

class whiteChocolate extends Chocolate{

 public whiteChocolate(String name, String color, int numberOfIngredients) {
  super(name, color, numberOfIngredients);
 }

 void taste (){

  System.out.println("White Chocolate is buttery sweet ");
 }

}
class milkChocolate extends Chocolate {

 public milkChocolate(String name, String color, int numberOfIngredients) {
  super(name, color, numberOfIngredients);
 }

 void taste() {

  System.out.println("Milk Chocolate is milky taste ");
 }

}


