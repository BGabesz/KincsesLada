package kincseslada1;
import java.util.Scanner;

public class lada extends adatok{
    
        public void ladakKiIrasa(){
            for (int i = 0; i < getLadak().length; i++) {
                System.out.println(getLadak()[i]+" :"+getTartalma()[i]);
            }
        }
        
        public void valasztas(){
            System.out.println("");
            System.out.println("Mekyik Ládában van a kincs?,1-3 választási lehetőségek");
        do {
            Scanner bekerOszlopSzama = new Scanner(System.in);
            setValasztas(bekerOszlopSzama.nextInt());
        } while (!(getValasztas() <= 3 && getValasztas() >= 1));
        System.out.println("Ezt választottad: " + getValasztas());
        }
        public void kitalalas(){
            do{
                valasztas();
                if(getValasztas()!=getJoLada()){
                    System.out.println("Nem ebben a ládában van a kincs");
                }else{
                    System.out.println("ELTALÁLTAD, az "+getLadak()[getJoLada()-1]+"ban volt a kincs");
                }
            }while(getValasztas()!=getJoLada());
    }
}
