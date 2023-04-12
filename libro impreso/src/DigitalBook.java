public class DigitalBook extends Book {

    private int ip;

    public DigitalBook() {
        ip = 0;
    }

    public DigitalBook(String title, String author, int ID, int ip) {
        super(title, author, ID);
        this.ip = ip;
    }

    //@Override
    public int difussion() {
        return 456;
    }

    @Override
    public String toString() {
        return super.toString()+
                "ip=" + ip +
                '}';
    }
}
