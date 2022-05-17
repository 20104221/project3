package tugas3_oop;

public class Fahrenheit {
  double toReamur(){
  //°Ré = (°F − 32) / 2,25
  return ((Tugas3_OOP.SuhuAwal-32)/2.25);
  }
  double toKelvin(){
  //K = (°F + 459,67) / 1,8
  return ((Tugas3_OOP.SuhuAwal+459.67)/ 1.8);
  }
  double toCelcius(){
  //°C = (°F − 32) / 1,8
  return ((Tugas3_OOP.SuhuAwal-32)/1.8);
  }
}