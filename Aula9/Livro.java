public class Livro extends Leitura {
    private String autor;
    private int anoPublicacao;
    private int numPaginas;
    private String isbn;

    public Livro() {

    }

    public Livro(int codigo, String titulo, String editora, String edicao,
            String autor, int anoPublicacao, int numPaginas, String isbn) {

        // reutilizar os dados de outra classe método SUPER

        super(codigo, titulo, editora, edicao);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public int getanoPublicacao() {
        return anoPublicacao;

    }

    public int getnumPaginas() {
        return numPaginas;
    }

    public String getisbn() {
        return isbn;
    }

    public void setisbn(String isbn) {
        this.isbn = isbn;
    }

    public void setanoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }

    @Override
    public java.lang.String toString() {
        return super.toString()
        +
        String.format("Autor: %s\nNumero Paginas: %s\nISBN %s\nAno Publicação",
        this.autor, 
        this.numPaginas,
        this.isbn, 
        this.anoPublicacao);
    }
}
