public class programaForma {
    public static void main(String[] args) {
        FormaGeometrica obj1 = new FormaGeometrica();
        System.out.println(obj1.toString() + " - " + obj1.getCorPreenchimento());//println .ToString()
        circulo obj2 = new circulo();
        System.out.println(obj2.toString() + " - " + obj2.getCorPreenchimento());//FormaGeometrica obj2 = new circulo();
        retangulo obj3 = new retangulo();
        System.out.println(obj3.toString() + " - " + obj3.getCorPreenchimento());
        triangulo obj4 = new triangulo();
        System.out.println(obj4.toString() + " - " + obj4.getCorPreenchimento());
    
    }
}
