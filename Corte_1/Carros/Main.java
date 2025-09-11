
package carros;


public class Main {

 
    public static void main(String[] args) {
        car car = new car();
        car.setCompany_name("Chevrolet");
        car.setModel_name("Cruze");
        car.setYear(2009);
        car.setMillaje(800);
        
        
        String nombre_empresa = car.getCompany_name();
        String modelo = car.getModel_name();
        int anio =car.getYear();
        double millaje = car.getMileage();
        
        
        
        
        System.out.println("Nombre de la compañia  : " + nombre_empresa);
        System.out.println("Nombre del modelo : "+ modelo);
        System.out.println("Año : "+ anio);
        System.out.println("Millaje : "+ millaje);
        
           
        
            
        
        
        
        
      
    }
    
}