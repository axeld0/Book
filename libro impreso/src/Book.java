public abstract class Book {
     private String title;
     private String author;
     private int ID;

     public Book()
     {
          title = "";
          author = "";
          ID = 0;
     }
     public Book(String title, String author, int ID) {
          this.title = title;
          this.author = author;
          this.ID = ID;
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getAuthor() {
          return author;
     }

     public void setAuthor(String author) {
          this.author = author;
     }

     public int getID() {
          return ID;
     }

     public void setID(int ID) {
          this.ID = ID;
     }

     //public abstract int difussion();
     //public abstract String writeDescription();



     @Override
     public boolean equals(Object obj) {

          boolean answer = false;
          if(obj != null)
          {
               if(obj instanceof Book){
                    Book aux = (Book) obj;
                    if(getTitle().equals(aux.getTitle()) && getID() == aux.getID())
                    {
                         answer =  true;
                    }
               }
          }
          return answer;
     }

     @Override
     public String toString() {
          return "Book{" +
                  "title='" + title + '\'' +
                  ", author='" + author + '\'' +
                  ", ID=" + ID ;
     }
}
