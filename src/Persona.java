
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Persona {
    Persona arrayObjetos[]=new Persona[30];
    private int edad;
    private String nombre;
    private int peso;
    private int altura;
    private char sexo;
    private String id;



    public Persona(int edad, String nombre, int peso, int altura, char sexo) {
        password pass = new password();
        this.id="";
        for (int i = 0; i < 8; i++) {
            this.id=this.id+pass.generarPassword();
        }
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
               if (sexo=='H' && sexo=='h') {
            this.sexo='-';
        }
        this.sexo = sexo;
        this.id = id;
    }

    public Persona(int edad, String nombre, char sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Persona() {
        password pass = new password();
        this.id="";
        for (int i = 0; i < 8; i++) {
            this.id=this.id+pass.generarPassword();
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo=='H' && sexo=='h') {
            this.sexo='-';
        }
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String calcularIMC(double peso, double altura){
                
      double calculo = (peso / (altura * altura));
        String resultado = "";

        if (calculo > 16.0 && calculo <= 18.4) {
            resultado = "por debajo de lo normal. Se recomienda iniciar una dieta balanceada, acompañada de la asesoría de un nutricionista.";
        }

        if (calculo > 18.5 && calculo <= 24.9) {
            resultado = "en el rango normal y saludable. Se recomienda continuar con una dieta balanceada, acompañada de actividad física frecuente.";
        }

        if (calculo >= 25.0) {
            resultado = "por encima de lo normal. Se recomienda iniciar un plan de actividad física, acompañado de una dieta balanceada y la asesoría de un nutricionista.";
        }

        return resultado;

    }
    public boolean esMayor(){
        if (this.edad>=18) {
            return true;
        }
    return false;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
//       if (sexo == 'm' || sexo == 'M') {
//            sexo = '-';
//        }
        return ""+edad + "\t" + nombre + "\t" + peso + "\t" + altura + "\t\t\t" + sexo + "\t" + id ;
    }


    private void llenarLista(){
           this.arrayObjetos[0]=new Persona(18,"Diana       ",90,170,'M');
           this.arrayObjetos[1]=new Persona(27,"Maria       ", 75, 160,'M');
           this.arrayObjetos[2]=new Persona(14,"Camilo      ", 36, 150,'H');
	   this.arrayObjetos[3]=new Persona(32,"Daniel      ", 50, 160,'H');
	   this.arrayObjetos[4]=new Persona(28,"David       ", 45, 155,'H');
	   this.arrayObjetos[5]=new Persona(15,"Marcela     ", 62, 170,'M');
	   this.arrayObjetos[6]=new Persona(19,"Hugo        ", 78, 160,'H');
	   this.arrayObjetos[7]=new Persona(19,"Daniela     ", 80, 167,'M');
	   this.arrayObjetos[8]=new Persona(20,"Henry       ",  45, 155,'H');
	   this.arrayObjetos[9]=new Persona(18,"Cristiano   ",  62, 165,'H');
	   this.arrayObjetos[10]=new Persona(12,"Mario      ",  84, 190,'H');
	   this.arrayObjetos[11]=new Persona(13,"Catalina   ",  67, 165,'M');
	   this.arrayObjetos[12]=new Persona(22,"Oscar      ",  91, 180,'H');
	   this.arrayObjetos[13]=new Persona(19,"Enrique    ",  43, 150,'H');
	   this.arrayObjetos[14]=new Persona(25,"Mariana    ",  55, 165,'M');
	   this.arrayObjetos[15]=new Persona(29,"Matilda    ",  65, 170,'H');
	   this.arrayObjetos[16]=new Persona(45,"Michael    ",  75, 190,'H');
	   this.arrayObjetos[17]=new Persona(52,"Michel     ",  85, 175,'M');
	   this.arrayObjetos[18]=new Persona(50,"Sofia      ",  95, 185,'M');
	   this.arrayObjetos[19]=new Persona(16,"Fernanda   ",  105, 180,'M');
	   this.arrayObjetos[20]=new Persona(25,"Fernando   ",  125, 190,'H');
	   this.arrayObjetos[21]=new Persona(26,"Fabio      ",  78, 170,'H');
	   this.arrayObjetos[22]=new Persona(32,"Sandra     ",  75, 170,'M');
	   this.arrayObjetos[23]=new Persona(16,"Salomon    ",  76, 180,'H');
	   this.arrayObjetos[24]=new Persona(24,"Pedro      ",  71, 165,'H');
	   this.arrayObjetos[25]=new Persona(26,"Juan       ",  69, 172,'H');
	   this.arrayObjetos[26]=new Persona(30,"Magdalena  ",  73, 169,'M');
	   this.arrayObjetos[27]=new Persona(11,"Jose       ",  75, 172,'H');
	   this.arrayObjetos[28]=new Persona(24,"Emilia     ",  68, 168,'M');
	   this.arrayObjetos[29]=new Persona(20,"Marcela    ",  69, 169,'M');
    }
    
    public Persona[] Listapersonas(){
        llenarLista();
    return this.arrayObjetos;
    }
    
    
    
}
