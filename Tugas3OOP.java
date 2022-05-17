package tugas3_oop;
import java.util.Scanner;

public class Tugas3_OOP {
static double SuhuAwal;
public static void main(String[] args) {
    String k ="PROGRAM KONVERSI SUHU [y/n]: ";
    Celcius fromCELCIUS= new CELCIUS();
    Fahrenheit fromFAHRENHEIT = new FAHRENHEIT();
    Kelvin fromKELVIN = new KELVIN();
    Reamur fromREAMUR = new REAMUR();
    
    double Fahrenheit,Kelvin,Celcius,Reamur;
    boolean valid = false;
    Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PROGRAM KONVERSI SUHU SEDERHANA ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("\n");
        System.out.print(k);
        
    String ans= input.next();
    while(ans.equals("y"))
    {
        System.out.print("\n");
        System.out.println("PILIHLAH JENIS SUHU SAAT INI UNTUK DIKONVERSI");
        System.out.println("[1] Celcius [2]  Fahrenheit [3] Kelvin [4] Reamur");
        int suhu = input.nextInt();
        System.out.print("MASUKAN NILAI SUHU AWAL : ");
        SuhuAwal=input.nextDouble();
        switch(suhu){
            case 1:
                Reamur = fromCelcius.toReamur();
                Fahrenheit = fromCelcius.toFahrenheit();
                Kelvin = fromCelcius.toKelvin();               
                System.out.println("SUHU AWAL ="+SuhuAwal+" Celcius\nHasil:");
                System.out.println("FAHRENHEIT  : "+Fahrenheit);
                System.out.println("KELVIN   : "+Kelvin);
                System.out.println("REAMUR      : "+Reamur);
                valid=true;
                break;         
            case 2:
                Celcius = fromFahrenheit.toCelcius();
                Reamur = fromFahrenheit.toReamur();
                Kelvin = fromFahrenheit.toKelvin();              
                System.out.println("SUHU AWAL ="+SuhuAwal+" Fahrenheit\nHasil:");
                System.out.println("CELCIUS : "+Celcius);
                System.out.println("KELVIN : "+Kelvin);
                System.out.println("REAMUR  : "+Reamur);
                valid=true;
                break;           
            case 3:
                Celcius = fromKelvin.toCelcius();
                Reamur = fromKelvin.toReamur();
                Fahrenheit = fromKelvin.toFahrenheit();              
                System.out.println("SUHU AWAL ="+SuhuAwal+" Kelvin\nHasil:");
                System.out.println("CELCIUS   : "+Celcius);
                System.out.println("FAHRENHEIT  : "+Fahrenheit);
                System.out.println("REAMUR  : "+Reamur);
                valid=true;
                break;          
            case 4:
                Celcius = fromReamur.toCelcius();
                Fahrenheit = fromReamur.toFahrenheit();
                Kelvin = fromReamur.toKelvin();
                System.out.println("SUHU AWAL ="+SuhuAwal+" Reamur\nHasil:");
                System.out.println("CELCIUS     : "+Celcius);
                System.out.println("FAHRENHEIT  : "+Fahrenheit);
                System.out.println("KELVIN  : "+Kelvin);
                valid=true;
                break;         
            default :
                System.out.println("PILIHLAH JENIS SUHU SECARA BENAR");
                break;
        }       
        System.out.print("\n");
        System.out.print("INGIN MELANJTKAN? "+k);
        ans = input.next(); 
    } if(ans.equals("n")){
    System.out.println("\n----PROGRAM SELESAI-----");   
}
}
}