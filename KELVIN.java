package tugas3_oop;

public class Kelvin {
  double toFahrenheit(){
  //°F = K × 1,8 − 459,67
  return (Tugas3_OOP.SuhuAwal*1.8-459.67);
  }
  double toReamur(){
  //°Ré = (K − 273,15) × 0,8
  return ((Tugas3_OOP.SuhuAwal-273.15)*0.8);
  }
  double toCelcius(){
  //°C = K − 273,15
  return (Tugas3_OOP.SuhuAwal-273.15);
  }
}