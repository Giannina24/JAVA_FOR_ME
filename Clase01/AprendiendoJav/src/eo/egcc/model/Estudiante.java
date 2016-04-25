
package eo.egcc.model;

public class Estudiante {

 private String nombres;
 private String apellidos;
 private String email;
 private int edad;
 private Boolean casado;

 public Estudiante(){
 nombres="Gustavo";
 apellidos="Coronel";
 edad=30;
 email="gcoronelc@gmail.com";
 casado=true;
 System.out.println("Objeto creado  ");
 }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getCasado() {
        return casado;
    }

    public void setCasado(Boolean casado) {
        this.casado = casado;
    }


    
}
