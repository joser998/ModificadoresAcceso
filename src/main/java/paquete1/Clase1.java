package paquete1;

public class Clase1 {
    /*                       Definicion de Atributos                              */
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtegido = "Valor atributo Protegido";
    String atributoDefault = "Valor atributo default o package";
    private String atributoPrivado = "Valor atributo privado";
    
    /*                            Constructores                                     */
    public Clase1(){
        System.out.println("Constructor Publico Vacio.");
    }
    
    public Clase1(String texto){
        System.out.println("Texto: "+texto);        
    }
    
    protected Clase1(String texto, String texto2){
        System.out.println("Constructor Protected con dos argumentos "+texto+ " , "+texto2);
    }
    
    Clase1(String texto1, String texto2, String texto3){
        System.out.println("Constructor Default o Package");
    }
    
    private Clase1(String texto1, String texto2, String texto3, String texto4){
        System.out.println("Constructor Privado");
    }
    
    /*                                      Metodos                                                  */
    public String metodoPublico(){
        return "Metodo Publico";
    }
    
    protected String metodoProtegido(){
        return "Metodo Protegido";
    }
    
    String metodoDefault(){
        return "Metodo Default o Package";
    }
    
    private String metodoPrivado(){
        return "Metodo Privado";
    }
}