package classWork.ClassWork2021_3.ClassWork4_Interfaces;

public class User implements IPerson, IUser {
   private String name;
   private String phone;
   private String login;
   private String password;

   public User(String name, String phone, String login, String password) {
      this.setName(name);
      this.setPhone(phone);
      this.setLogin(login);
      this.setPassword(password);
   }

   @Override
   public String getName() {
      return name;
   }

   @Override
   public void setName(String name) {
      this.name = name.strip();
   }

   @Override
   public String getPhone() {
      return phone;
   }

   @Override
   public void setPhone(String phone) {
      this.phone = phone.strip();
   }

   @Override
   public String getLogin() {
      return login;
   }

   @Override
   public void setLogin(String login) {
      this.login = login.strip();
   }

   @Override
   public boolean checkLoginPassword(String login, String password) {
      return this.login.strip().equalsIgnoreCase(login.strip()) && this.password.equals(password);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      else if (obj.getClass() != this.getClass())
         return false;
      else {
         User temp = (User) obj;
         return checkLoginPassword(temp.login, temp.password) && this.name.strip().equalsIgnoreCase(temp.getName().strip()) && this.phone.equalsIgnoreCase(temp.getPhone().strip());
      }
   }

   @Override
   public void setPassword(String password) {
      this.password = password.strip();
   }

   @Override
   public String toString() {
      return "User{" + "name='" + name + '\'' + ", phone='" + phone + '\'' + ", login='" + login + '\'' + ", password='" + password + '\'' + '}';
   }
}
