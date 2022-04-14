
/**
 * Write a description of class cadastroaluno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cadastroaluno
{
    // instance variables - replace the example below with your own
private int RGM;
private String nome;
private int anoIngresso;

    /**
     * Constructor for objects of class cadastroaluno
     */
    public cadastroaluno(int RGM, String nome, int anoIngresso)
    {
        this.RGM=RGM;
        this.nome=nome;
        this.anoIngresso=anoIngresso;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getRGM(){
        return this.RGM;
    }
      public String getnome(){
        return this.nome;
    }
      public int getIngresso(){
        return this.anoIngresso;
    }
    public void setRGM(int RGM){
      this.RGM=RGM;
    }
     public void setnome(String nome){
      this.nome =nome;
    }
     public void setanoIngresso(int anoIngresso){
      this.anoIngresso =anoIngresso;
    }
    @Override
    public String toString(){
        return super.toString() +":\n"
        + String.format("RGM:%d\nNome:%s\nanoIngresso:%d",
        this.anoIngresso,this.nome,this.RGM);
    }
}
