package calculadora1;
import javax.swing.JOptionPane;


public class Calculadora1 {
    private double real;
    private double imaginario;

    public Calculadora1() {
    }
    

    public Calculadora1(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
    
    public Calculadora1 sumar(Calculadora1 otroComplejo){
        Calculadora1 complejo =new Calculadora1();
        double nuevoReal = this.real + otroComplejo.getReal();
        double nuevoImaginario = this.imaginario + otroComplejo.getImaginario();
        complejo.setReal(nuevoReal);
        complejo.setImaginario(nuevoImaginario);
        
        return complejo;
        
    }
    
    public Calculadora1 restar(Calculadora1 otroComplejo){
        Calculadora1 complejo =new Calculadora1();
        double nuevoReal = this.real - otroComplejo.getReal();
        double nuevoImaginario = this.imaginario - otroComplejo.getImaginario();
        complejo.setReal(nuevoReal);
        complejo.setImaginario(nuevoImaginario);
        
        return complejo;
        
    }
    
    public Calculadora1 multiplicar(Calculadora1 otroComplejo){
      Calculadora1 complejo= new Calculadora1();
      
      double nuevoReal = this.real * otroComplejo.getReal() - this.getImaginario() * otroComplejo.getImaginario();
      double nuevoImaginario = this.real * otroComplejo.getImaginario() + this.imaginario * otroComplejo.getReal();
      
     complejo.setReal(nuevoReal);
     complejo.setImaginario(nuevoImaginario);
     
     return complejo;
    }
    
     public Calculadora1 dividir(Calculadora1 otroComplejo){
         Calculadora1 complejo = new Calculadora1();
         double nuevoReal = (this.real * otroComplejo.getReal() + this.imaginario * otroComplejo.getImaginario()) / (otroComplejo.getReal() * otroComplejo.getReal() + otroComplejo.getImaginario() * otroComplejo.getImaginario());
         double nuevoImaginario = (this.imaginario * otroComplejo.getReal() - this.real * otroComplejo.getImaginario()) / (otroComplejo.getReal() * otroComplejo.getReal() + otroComplejo.getImaginario() * otroComplejo.getImaginario());
     
     complejo.setReal(nuevoReal);
     complejo.setImaginario(nuevoImaginario);
     
     return complejo;
     }
     
     @Override
     public String toString(){
         return String.format("(%.2f, %.2fi)", real, imaginario);
     }
     
     public static void main(String[] args) {
       double a=Double.parseDouble(JOptionPane.showInputDialog("Dime tu numero Real numero 1 "));
       double b=Double.parseDouble(JOptionPane.showInputDialog("Dime tu numero imaginario numero 1 "));
       double c=Double.parseDouble(JOptionPane.showInputDialog("Dime tu numero Real numero 2 "));
       double d=Double.parseDouble(JOptionPane.showInputDialog("Dime tu numero imaginario numero 2 "));
     
         Calculadora1 c1 = new Calculadora1(a,b);
         Calculadora1 c2 = new Calculadora1(c,d);
         
       byte op;
    op=Byte.parseByte(JOptionPane.showInputDialog(null, "Selecciona"
            + " La operacion que quieras realizar \n "
            + "1|SUMA \n 2|RESTA \n 3|MULTIPLICACION "
            + "\n 4|DIVISION \n 5|POTENCIA DE I"));
    
    switch(op){
        case 1:
            System.out.println("EL RESULTADO DE TU SUMA ES: "+ c1.sumar(c2));
            break;
         case 2:
            System.out.println("EL RESULTADO DE TU RESTA ES: "+ c1.restar(c2));
            break;
        case 3:
            System.out.println("EL RESULTADO DE TU MULTIPLICACION ES: "+ c1.multiplicar(c2));
            break;
        case 4:
            System.out.println("EL RESULTADO DE TU DIVISION ES: "+ c1.dividir(c2));
            break;
        case 5:
            byte opi=Byte.parseByte(JOptionPane.showInputDialog(null, "Dime a que potencia esta elevado i"));
            double pot;
            pot=opi%4;
            if (pot==0){
                System.out.println("EL RESULTADO DE TU POTENCIA ES: 1" );
            }else{
                        if(pot==1){
                        System.out.println("EL RESULTADO DE TU POTENCIA ES: i" );
                        }else{
                        if(pot==2){
                        System.out.println("EL RESULTADO DE TU POTENCIA ES: -1" );
                        }else{
                        if(pot==3){
                        System.out.println("EL RESULTADO DE TU POTENCIA ES: -i" );
                        }
                       
                        }
              
            
            
            break;
    }
     }
}
     }
}     

