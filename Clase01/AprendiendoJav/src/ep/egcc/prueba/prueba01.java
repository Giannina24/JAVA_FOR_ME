
package ep.egcc.prueba;

import eo.egcc.model.Estudiante;

public class prueba01 {
    
    public static void main(String[] args) {
        
        Estudiante est01=new Estudiante();
        
        est01.setApellidos("Silva");
        est01.setNombres("Rosa");
        est01.setEdad(16);
        est01.setEmail("rosa1@hotmail.com");
        est01.setCasado(true);
   System.out.println("Nombres:"+est01.getNombres());
   
    
    }
    
   
    
    
}
