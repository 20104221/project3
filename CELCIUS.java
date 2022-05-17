package tugas3_oop;

public class Celcius {
   double toFahrenheit(){
   //°F = °C × 1,8 + 32
   return (Tugas3_OOP.SuhuAwal*1.8+32);
   }
   double toReamur(){
   //°Ré = °C × 0,8
   return (Tugas3_OOP.SuhuAwal*0.8);
   }
   double toKelvin(){
   //K = °C + 273,15
   return (Tugas3_OOP.SuhuAwal+273.15);
   }
}