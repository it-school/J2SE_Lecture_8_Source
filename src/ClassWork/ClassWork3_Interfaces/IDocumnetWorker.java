package ClassWork.ClassWork3_Interfaces;

public interface IDocumnetWorker
{
	default void OpenDocument()
	{
		System.out.println("Документ открыт");
	}

	void EditDocument();

	void SaveDocument();
}
