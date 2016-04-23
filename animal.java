
/**
 * Write a description of class animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class animal implements Acciones
{
private String raza;

public void cazar(){
System.out.println("el animal "+raza+" esta cazando");
}
    
public void setraza(String raz){
this.raza = raz;
}  

public String getraza(){
return raza;
}
public void desplazar(){
System.out.println("el animal de raza " + raza + " se esta desplazandose");
}
public void jugar(){
System.out.println("El animal de raza "+ raza+ " esta jugando");
}
public void alimentarse(){
System.out.println("El animal de raza "+ raza+ " esta alimentandose");
}
  
   public void dormir(){}
}
