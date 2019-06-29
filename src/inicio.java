
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Persona p = new Persona();
        int suma1 = 0;
        int suma2 = 0;
        int numH = 0;
        int numM = 0;
        int numMayores = 0;
        int numMenores = 0;
        double pPromedioH = 0;
        double pPromedioM = 0;
        System.out.println("Buenas noches, a continuación se muestran los registros:");
        System.out.println("Edad\t nombre \tpeso \testatura \t\tsexo \tid");

        Persona ListaPersonas[] = p.Listapersonas();

        for (int i = 0; i < ListaPersonas.length; i++) {
            System.out.println(ListaPersonas[i].toString());
        }

        for (int i = 0; i < ListaPersonas.length; i++) {
            if (ListaPersonas[i].getSexo() == 'H') {
                suma1 = suma1 + ListaPersonas[i].getPeso();
                numH++;
            }
        }
        pPromedioH = suma1 / numH;

        System.out.println("El promedio del peso de los hombres es:" + pPromedioH);

        for (int i = 0; i < ListaPersonas.length; i++) {
            if (ListaPersonas[i].getSexo() == 'M') {
                suma2 = suma2 + ListaPersonas[i].getPeso();
                numM++;
            }
        }
        pPromedioM = suma2 / numM;

        System.out.println("El promedio del peso de las mujeres es:" + pPromedioM);

        System.out.println("Las personas que tienen un peso mayor a 85 kilos son: ");
        System.out.println("Edad\t nombre \tpeso \testatura \t\tsexo \tid");

        for (int i = 0; i < ListaPersonas.length; i++) {

            if (ListaPersonas[i].getPeso() > 85) {

                System.out.println(ListaPersonas[i].toString());

            }

        }

        System.out.println("El número de mujeres es: " + numM);

        System.out.println("El número de hombres es: " + numH);

        for (int i = 0; i < ListaPersonas.length; i++) {

            if (ListaPersonas[i].esMayor()) {

                numMayores++;

            } else {
                numMenores++;
            }

        }

        System.out.println("El número de personas mayores de edad es: " + numMayores);

        System.out.println("El número de personas menores de edad es: " + numMenores);
        
        
        for (int i = 0; i < ListaPersonas.length; i++){
            
           // System.out.println("El IMC de " + ListaPersonas[i].getNombre()+ "es: " + ListaPersonas[i].calcularIMC(ListaPersonas[i].getPeso(), ListaPersonas[i].getAltura()));
            
            System.out.println( ListaPersonas[i].calcularIMC(ListaPersonas[i].getPeso(), ListaPersonas[i].getAltura()));
            
        }
        


        
        
    }
}
