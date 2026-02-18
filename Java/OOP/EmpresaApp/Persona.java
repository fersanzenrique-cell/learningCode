package Java.OOP.EmpresaApp;

public class Persona {
    private String nombre;
    private int edad;
    public Persona (String n, int e) throws PersonaException {
        if (e < 16) {
            throw new PersonaException("Edad insuficiente");
        } else if (e > 65) {
            throw new PersonaException("Edad no válida, demasiada alta");
        } else if (n.length() > 1) {
            for (char a : n.toCharArray()) {
                if (Character.isDigit(a)) {
                    throw new PersonaException("Hay números en el nombre");
                } else {
                    this.nombre = n.substring(0,1).toUpperCase() + n.substring(1);
                    this.edad = e;
                }
            }
        }
    }
    public Persona (String n) throws PersonaException {
        if (n.length() > 1) {
            for (char a : n.toCharArray()) {
                if (Character.isDigit(a)) {
                    throw new PersonaException("Hay números en el nombre");
                } else {
                    this.nombre = n.substring(0,1).toUpperCase() + n.substring(1);

                }
            }
        }
    }
    public String getNombre() {
       return String.copyValueOf(nombre.toCharArray());
    }
    public void setNombre(String n) throws PersonaException {
        if (n.length() > 1) {
            for (char a : n.toCharArray()) {
                if (Character.isDigit(a)) {
                    throw new PersonaException("Hay números en el nombre");
                } else {
                    this.nombre = n.substring(0,1).toUpperCase() + n.substring(1);

                }
            }
        }
    }
    public int getEdad() {
        int a = this.edad;
        return a;
    }
    public void setEdad(int e) throws PersonaException {
        if (e < 16) {
            throw new PersonaException("Edad insuficiente");
        } else if (e > 65) {
            throw new PersonaException("Edad no válida, demasiada alta");
        } else {
            this.edad = e;
        }
    }

    protected static class PersonaException extends Exception {
        protected PersonaException(String message){
           super("No se pudo crear Persona: " + message);
        }
    }
}
