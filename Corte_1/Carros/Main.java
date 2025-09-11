
package carros;


public class Main {

 
    public static void main(String[] args) {
        Car car = new Car();
        car.setCompany_name("Chevrolet");
        car.setModel_name("Cruze");
        car.setYear(2009);
        
        
        String nombre_empresa = car.getCompany_name();
        String modelo = car.getModel_name();
        int anio =car.getYear();
        double millaje = car.getMileage();
        
        
        
        
        System.out.println("Company name: " + nombre_empresa);
        System.out.println("Model name: "+ modelo);
        System.out.println("Year"+ anio);
        System.out.println("Mileage: "+ millaje);
        
           
        
            
        
        
        
        
      
    }
    
}
