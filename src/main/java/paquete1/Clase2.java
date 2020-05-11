package paquete1;

public class Clase2 {
    /*              Prueba de Constructor de Clase1 mismo Paquete          */
    public Clase2(){
        /*       Llamando Constructores de Clase1    */
        new Clase1();  //Podemos llamar al Constructor publico de Clase1 
        new Clase1("Primer parametro", "Segundo Parametro");  //Podemos llamar sin ningun problema al Constructor Protected de Clase 1
                                                                   //con dos parametros, ya que estamos dentro del mismo paquete 
        new Clase1("Primer parametro","Segundo Parametro","Tercer Parametro"); //Llamamos contructor con 3 parametros que esta default
                                                                                    //en Clase1
        /* No es posible llamar a este Constructor de tipo Private con 4 argumentos aunque estemos en el mismo paquete, ya que solo acepta 
              miembros de su misma clase */                                                                                                                                             
        //new Clase1("Primer parametro","Segundo Parametro","Tercer Parametro","Cuarto Parametro");    
    }
    
    public void pruebaDesdeClase2(){
        /*                  Probando llamada a Atributos de la Clase1 del mismo paquete                             */
        Clase1 ob1 = new Clase1();
        System.out.println("Accediendo al atributoPublico de Clase1: "+ob1.atributoPublico);    
        System.out.println("Accediendo al atributoProtegido de Clase1: "+ob1.atributoProtegido);
        System.out.println("Accediendo al atributoDefault de Clase1: "+ob1.atributoDefault);
        
        /* No es posible acceder a este atributo de Clase1 debido a que es private, solo es posible mediante Getters y Setters
        */
        //System.out.println("Accediendo al atributoPrivado de Clase1: "+ob1.atributoPrivado);
        
        
        /*                  Probando llamada a Metodos de Clase 1 del mismo paquete                              */
        
        System.out.println("Accediendo a metodoPublico de Clase1: "+ob1.metodoPublico());
        System.out.println("Accediendo a metodoProtegido de Clase1: "+ob1.metodoProtegido());
        System.out.println("Accediendo a metodoDefault de Clase1: "+ob1.metodoDefault());
        
        /* No es posible acceder a metodo de Clase1 teniendo el modificador de acceso privado  */
        //System.out.println("Accediendo a metodoPrivado de Clase1: "ob1.metodoPrivado());
    }

    public static void main(String[] args) {
        //Instancia de misma Clase2
        Clase2 clase2 = new Clase2();
        //Mandamos a llamar metodo pruebaDesdeClase2() 
        clase2.pruebaDesdeClase2();
 
    }
}