package classWork.ClassWork2021_3.ClassWork4_Interfaces;

public interface IUser {
   String getLogin();

   void setLogin(String login);

   boolean checkLoginPassword(String login, String password);

   void setPassword(String password);
}
