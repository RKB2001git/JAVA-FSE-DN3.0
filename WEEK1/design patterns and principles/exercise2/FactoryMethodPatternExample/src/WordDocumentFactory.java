public class WordDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'createDocument'");
       return new WordDocument();
    }
    
}
