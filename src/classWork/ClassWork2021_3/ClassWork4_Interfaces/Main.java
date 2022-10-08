package classWork.ClassWork2021_3.ClassWork4_Interfaces;

public class Main {
   public static void main(String[] args) {
      User user1 = new User("User1", "234567890", "root", "passw1");
      User user2 = new User("User2", "2345674767890", "guest", "passw2");

      System.out.println(user1.checkLoginPassword("ROOT", "passw1"));

      System.out.println(user1.equals(user1));
   }
}
