package ClassWork.ClassWork3;

public class Main {
   public static void main(String[] args) {
      String key = "pro";
      DocumentWorker doc = null;

      switch (key.toLowerCase()) {
         case "pro":
            doc = new ProDocumentWorker();
            break;
         case "expert":
            doc = new ExpertDocumentWorker();
            break;
         default:
            doc = new DocumentWorker();
      }

      System.out.println(key);
      doc.OpenDocument();
      doc.EditDocument();
      doc.SaveDocument();
   }
}
