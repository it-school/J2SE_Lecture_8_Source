package polymorphism.example1;

public class Main {
   public static void main(String[] args) {
      // Реализовать демонстрацию работы автомата для приготовления напитков: чай, кофе, молочный коктейль, ...
      DrinkMachine drinkMachine = new DrinkMachine(new CocktailMaker("CocktailMaker-01"), new CoffeeMaker("CoffeeMaker-02"), new TeaMaker("TeaMaker-03"));
      drinkMachine.demo();
   }
}