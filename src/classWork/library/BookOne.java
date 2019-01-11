package classWork.library;

public class BookOne {

    public String author;
    public String title;
    public int numOfpages;

    private String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private int getNumOfpages() {
        return numOfpages;
    }

    private void setNumOfpages(int numOfpages) {
        this.numOfpages = numOfpages;
    }

     String getFromWho() {
        return fromWho;
    }

     void setFromWho(String fromWho) {
        this.fromWho = fromWho;
    }

    private String getCodeId() {
        return codeId;
    }

    private void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    private boolean isNeedToRepair() {
        return needToRepair;
    }

    private void setNeedToRepair(boolean needToRepair) {
        this.needToRepair = needToRepair;
    }

    @Override
    public String toString() {
        return "BookOne{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", numOfpages=" + numOfpages +
                ", codeId='" + codeId + '\'' +
                '}';
    }

     String fromWho;
    public String codeId;
    protected boolean needToRepair;

   public BookOne(){}

    public BookOne(String author, String title, String shifr) {
        this.author = author;
        this.title = title;
        this.codeId = shifr;
       // this.codeId = String.valueOf(this.hashCode());
    }

    public void correctChangeBook(String author, String title, int numOfpages, String shifr){
        this.author = author;
        this.title = title;
        this.numOfpages = numOfpages;
        this.codeId = shifr;
    }
}
