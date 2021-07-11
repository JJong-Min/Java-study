public class CustomAnnotationMain {
	
	public static void main(String args[]) {
		new CustomAnnotationMain().testDocument();
		new CustomAnnotationMain().testNoDocument();
	}

	@CustomAnnotation(testDocument = "document test")
	public void testDocument() {};
	
	@CustomAnnotationNoDocument(testNoDocument = "document test")
	public void testNoDocument() {};
	
}

