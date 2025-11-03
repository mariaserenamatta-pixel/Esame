
package serra;
import java.util.*;                     //libreria

public class Serra {           //attributi
String nome;
double temperatura;
boolean Stato_acceso;

public Serra(){}
public Serra(String nome,double temperatura,boolean Stato_acceso){
this.nome=nome;
this.temperatura=temperatura;
this.Stato_acceso=Stato_acceso;
}
public void Stampa()
{
 System.out.println("Il nome della serra:"+nome+" la temperatura:"+temperatura+"Lo stato del riscaldamento:"+Stato_acceso);
}
public void Impianto(double temperatura)
{
    if(temperatura<20){
    System.out.println("L'ambiente è freddo");
    }
    else
    {
    System.out.println("L'ambiente è caldo");
    }
}
    
    public static void main(String[] args) {
    Serra ser1=new Serra();
    ser1.nome="Fiorita";
    ser1.temperatura=25;
    ser1.Stato_acceso=false;
    ser1.Stampa();
    Serra ser2=new Serra("Serena",26,true);
    ser2.Stampa();
    ser2.Impianto(26);
    }
    
}
