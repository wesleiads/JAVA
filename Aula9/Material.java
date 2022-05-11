public class Material {
    private int codigo;
    private String titulo;

// construtora padrao
    public Material() {
        
    }
// construtora com carga
    public Material(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;

    }

    public int getCodigo() {
        return this.getCodigo();
    }

    public String getTitulo() {
        return this.getTitulo();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return String.format("Codigo, : %d\nTitualo %s\n", this.codigo, this.titulo);
    }
}