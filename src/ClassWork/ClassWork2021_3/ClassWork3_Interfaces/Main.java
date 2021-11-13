package ClassWork.ClassWork2021_3.ClassWork3_Interfaces;

public class Main
{
	public static void main(String[] args)
	{
		String key = "EXPERT";
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
