public class Leitura extends Material {
    private String editora;
    private String edicao;

    public Leitura() {

    }

    public Leitura(int codigo, String editora, String edicao, String titulo) {
        super(codigo, titulo);
        this.edicao = edicao;
        this.editora = editora;

    }

    public String getTitulo() {
        return editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;

    }
    @Override
    public String toString() {
        return super.toString()+
        String.format("Editora: %s\nEdicao: %s\n",
         this.editora, 
        this.edicao);
    }
}
