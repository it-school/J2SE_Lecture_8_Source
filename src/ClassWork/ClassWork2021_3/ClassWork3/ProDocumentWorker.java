package ClassWork.ClassWork2021_3.ClassWork3;

public class ProDocumentWorker extends DocumentWorker {
   @Override
   public void EditDocument() {
      System.out.println("Документ отредактирован");
   }

   @Override
   public void SaveDocument() {
      System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии	" +
              "Эксперт");
   }
}
