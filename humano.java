
/**
 * Write a description of class humano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class humano implements Acciones, AccionesHumano
{
private String curp;
  
public void razonar(){
System.out.println("La persona esta razonando");
System.out.println("Estoy desde la clase Humano");
}
public void setcurp(String cur){
this.curp = cur;
}  

public String getcurp(){
return curp;
}
public void desplazar(){
System.out.println("Esta caminando el humano : "+curp);
}
   public void jugar(){
    System.out.println("Esta jugando un deporte el humano");
}
   public void alimentarse(){
    System.out.println("Esta comiendo la persona");
}
   public void dormir(){}

public void bailar(){
System.out.println("Esta persona esta bailando");
}
    public void trabajar(String curp){
    System.out.println("Esta persona esta trabajando"+ curp);
}
    

}
