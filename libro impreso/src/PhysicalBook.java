import java.util.Objects;

public class PhysicalBook extends Book{

    private String editor;
    private boolean hardCover;

    public PhysicalBook(String title, String author, int ID, String editor, boolean hardCover) {
        super(title, author, ID);
        this.editor = editor;
        this.hardCover = hardCover;
    }

    //@Override
    public int difussion() {
        return 123;
    }

    //@Override
    public String writeDescription(String description) {
        String writeDescription = "Description : "+description +" .";

        return writeDescription;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "editor='" + editor + '\'' +
                ", hardCover=" + hardCover +
                '}';
    }
}

