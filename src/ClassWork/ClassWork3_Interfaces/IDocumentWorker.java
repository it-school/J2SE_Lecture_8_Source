package ClassWork.ClassWork3_Interfaces;

public interface IDocumentWorker {
   default void OpenDocument() {
      System.out.println("Документ открыт");
   }

   void EditDocument();

   void SaveDocument();
}
