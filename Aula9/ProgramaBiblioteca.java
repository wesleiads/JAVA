import java.util.Date;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Livro livro=new Livro(
            1,
            "livro",
            "Teste",
            "1a edicao",
            "Pedro",
            2015,
            214,
            "132456789"
            );
            
            System.out.println(livro.toString());
            Revista revista=new Revista(
            1,
             "teste", 
             "editora teste", 
             "edicao teste", 
             "teste", 
             "anoPublicacao", 
             "numPaginas", 
             "isbn", 
             new date(2022,05,04), 
             "editorial", 
             "reportagemCapa"
             );

            System.out.println(revista.toString());
    }
    
}
