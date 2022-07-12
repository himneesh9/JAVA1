import java.util.Objects;
import java.util.Scanner;
class Library{
    Scanner s = new Scanner(System.in);
    String [] books = new String[100];
    String [] issuedbooks = new String[100];
    int noofbooks;
    int a = 1;
    String savebook;
    int l;
    Library(int n){
        noofbooks = n;
        for(int i = 0 ; i<=noofbooks ; i++){
            books[i] = s.next();
        }
    }
    public void addBooks(String newbook){
        books[noofbooks+a] = newbook ;
        a++;
    }
    public void issueBook(String booktaken) {
        for (int i = 0; i < noofbooks + a; i++) {
            if(Objects.equals(booktaken, books[i])){
                issuedbooks[i] = books[i] ;
                savebook = books[i] ;
                l = i;
                books[i]="Not available";
            }
        }
    }
    public void returnBook(String bookreturn){
        if(Objects.equals(bookreturn, savebook)){
            books[l] = bookreturn ;
        }
    }
    public void showAvailableBooks(){
        System.out.println("Books Available:");
        for(int i = 0 ; i< noofbooks + a  ; i++){
            if(!Objects.equals(books[i], "Not available")){
            System.out.println(books[i]);
        }
            }
        System.out.println("Issued book:");
        for(int j = 0 ; j< noofbooks + a  ; j++){
            if(issuedbooks[j] == null){
                continue;
            }
            System.out.println(issuedbooks[j]);
        }
    }
}
public class CreateLibrary {
    public static void main(String[] args) {
        Library l = new Library(2);
        l.addBooks("3 States");
        l.addBooks("2 states");
        l.issueBook("2 states");
//        l.issueBook("himneesh");
        l.showAvailableBooks();
    }
}
