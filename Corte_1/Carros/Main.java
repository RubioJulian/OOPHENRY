package carros;


public class Main {


public static void main(String[] args) {

car car1 = new car("Chevrolet", "Cruze", 2009, 800);
car car2 = new car("Toyota", "Corolla", 2015, 45000);
car car3 = new car("Renault", "Sandero", 2018, 23000.5);


System.out.println("--- Carro 1 ---");
System.out.println("Nombre de la compañía: " + car1.getCompanyName());
System.out.println("Nombre del modelo : " + car1.getModelName());
System.out.println("Año : " + car1.getYear());
System.out.println("Millaje : " + car1.getMileage());
System.out.println();


System.out.println("--- Carro 2 ---");
System.out.println("Nombre de la compañía: " + car2.getCompanyName());
System.out.println("Nombre del modelo : " + car2.getModelName());
System.out.println("Año : " + car2.getYear());
System.out.println("Millaje : " + car2.getMileage());
System.out.println();


System.out.println("--- Carro 3 ---");
System.out.println("Nombre de la compañía: " + car3.getCompanyName());
System.out.println("Nombre del modelo : " + car3.getModelName());
System.out.println("Año : " + car3.getYear());
System.out.println("Millaje : " + car3.getMileage());
System.out.println();
}
}