package classWork.ClassWork2021_11.task3;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("\nTask3:\n");
      Scanner scanner = new Scanner(System.in);

      System.out.println("Input registration key: ");
      String key = scanner.nextLine();

      DocumentWorker documentWorker;
      switch (key.strip().toLowerCase()) {
         case "pro" -> documentWorker = new ProDocumentWorker();
         case "exp" -> documentWorker = new ExpertDocumentWorker();
         default -> documentWorker = new DocumentWorker();
      }

      documentWorker.openDocument();
      documentWorker.editDocument();
      documentWorker.saveDocument();
   }
}
