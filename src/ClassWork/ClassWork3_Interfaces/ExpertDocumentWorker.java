package ClassWork.ClassWork3_Interfaces;

public class ExpertDocumentWorker extends ProDocumentWorker
{
	@Override
	public void SaveDocument()
	{
		System.out.println("Документ сохранен в новом формате");
	}
}
