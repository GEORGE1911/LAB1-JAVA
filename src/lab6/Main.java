package lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Triangle triangle = new Triangle(5);
        //Square square = new Square(6);

        List<Book> listaDeCarti = new ArrayList<>();
        List<String> ListaDeCarti= new ArrayList<>();

        listaDeCarti.add(new Book("Book 1" , "Author 1" , "aaab"));
        listaDeCarti.add(new Book("Book 2" , "Author 2" , "1234"));
        listaDeCarti.add(new Book("Book 3" , "Author 3" , "abcd"));
    }

}
