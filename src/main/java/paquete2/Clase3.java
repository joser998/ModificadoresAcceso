package paquete2;
import paquete1.Clase1;
public class Clase3 extends Clase1{
    public Clase3() {
        /*       Llamando Constructores de Clase1    */
    super("Primer parametro","Segundo Parametro");    
    new Clase1();  //Podemos llamar al Constructor publico de Clase1 
   // new Clase1("Primer parametro", "Segundo Parametro");  //Podemos llamar sin ningun problema al Constructor Protected de Clase 1
                                                             //con dos parametros, ya que estamos dentro del mismo paquete 
    //new Clase1("Primer parametro", "Segundo Parametro", "Tercer Parametro"); //Llamamos contructor con 3 parametros que esta default
                                                                                //en Clase1
    /* No es posible llamar a este Constructor de tipo Private con 4 argumentos aunque estemos en el mismo paquete, ya que solo acepta 
        miembros de su misma clase */
    //new Clase1("Primer parametro","Segundo Parametro","Tercer Parametro","Cuarto Parametro");    
    }
    
    public void pruebaDesdeClase3(){
/*                  Probando llamada a Atributos de la Clase1 del mismo paquete                             */
    Clase1 ob1 = new Clase1();
    System.out.println("Accediendo al atributoPublico de Clase1: "+atributoPublico);    
    System.out.println("Accediendo al atributoProtegido de Clase1: "+atributoProtegido);  //Podemos acceder a este atributo protegido sin la instancia de la clase
                                                                                            //es posible hacerlo directamente... 
                                                                                            
  //System.out.println("Accediendo al atributoDefault de Clase1: "+ob1.atributoDefault);   //--El atributo esta por default, por lo tanto 
                                                                                              //  no es posible acceder a el desde este paquete
  //System.out.println("Accediendo al atributoPrivado de Clase1: "+ob1.atributoPrivado);
         
/*  Probando llamada a Metodos de Clase 1 del mismo paquete                    */
        
    System.out.println("Accediendo a metodoPublico de Clase1: "+metodoPublico()); //--Puedo acceder a el por que es un metodo publico
    System.out.println("Accediendo a metodoProtegido de Clase1: "+metodoProtegido()); //--Puedo acceder a el mediante la herencia sin necesidad de instancia de clase, directamente.
  // System.out.println("Accediendo a metodoDefault de Clase1: "+ob1.metodoDefault()); //--No puedo acceder por que esta por defecto
        
        /* No es posible acceder a metodo de Clase1 teniendo el modificador de acceso privado  */
        //System.out.println("Accediendo a metodoPrivado de Clase1: "ob1.metodoPrivado());
    }
    
    public static void main(String[] args) {
        /* Instanciamos Clase3 y llamamos metodo para hacer prueba */
        Clase3 clase3 = new Clase3();
        clase3.pruebaDesdeClase3();
    }  
}