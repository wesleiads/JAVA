//constructor
public class pessoa {
    // instance variables - replace the example below with your own
    private int idade;
    private String nome;
    private char genero;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;
    
    public pessoa(){

    }

    public pessoa(int idade, String nome, char genero, int gostaViajar, int gostaCozinhar, int gostaCinema,
    int gostaBalada, int gostaFicarEmCasa) 
    {
        this.idade = idade;
        this.nome = nome;
        this.genero = genero;
        this.gostaViajar = gostaViajar;
        this.gostaCozinhar = gostaCozinhar;
        this.gostaCinema = gostaCinema;
        this.gostaBalada = gostaBalada;
        this.gostaFicarEmCasa = gostaFicarEmCasa;

    }
    public int getidade() {
        return this.idade;
    }

    public String getnome() {
        return this.nome;
    }

    public char getgenero() {
        return this.genero;
    }

    public int getgostaViajar() {
        return this.gostaViajar;
    }

    public int getgostaCozinhar() {
        return this.gostaCozinhar;
    }

    public int getgostaCinema() {
        return this.gostaCinema;
    }

    public int getgostaBalada() {
        return this.gostaBalada;
    }

    public int gostaFicarEmCasa() {
        return this.gostaFicarEmCasa;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void setanogenero(char genero) {
        this.genero = genero;
    }

    public void setgostaViajar(int gostaViajar) {
        this.gostaViajar = gostaViajar;
    }

    public void setgostaCozinhar(int gostaCozinhar) {
        this.gostaCozinhar = gostaCozinhar;
    }

    public void setgostaCinema(int gostaCinema) {
        this.gostaCinema = gostaCinema;
    }
    public void setgostaBalada(int gostaBalada){
        this.gostaBalada =gostaBalada;
    }
    public void setgostaFicarEmCasa(int gostaFicarEmCasa){
        this.gostaFicarEmCasa =gostaFicarEmCasa;
    }
    @Override
    public String toString() {
        return super.toString();
                String.format("Nome, %\n"+
                "Idade, %d\n"+
                "Genero, %c\n"+
                "gostaFicarEmCasa, %d\n"+
                "gostaFicarEmCasa, %d\n"+
                "gostaFicarEmCasa, %d\n",
                "gostaFicarEmCasa, %d\n",
                "gostaFicarEmCasa, %d\n",
                this.nome,
                this.nome,
                this.nome,
                this.nome,
                this.nome, 
                this.nome,   
                this.nome,
                this.nome,
                );
    }
}