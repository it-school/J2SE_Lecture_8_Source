package ClassWork.ClassWork2021_3.ClassWork3_Interfaces;

public class DocumentWorker implements IDocumentWorker {
   @Override
   public void EditDocument() {
      System.out.println("Редактирование документа доступно в версии Про");
   }

   @Override
   public void SaveDocument() {
		System.out.println("Сохранение документа доступно в версии Про");
	}
}
