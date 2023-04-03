public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Luciana");
        cliente.setTelefono("584585");
        cliente.setCredito(false);
        cliente.setEdad(30);

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.isCredito());
        System.out.println(cliente.getEdad());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Mickael");
        trabajador.setTelefono("8566985");
        trabajador.setSalario("14000");
        trabajador.setEdad(30);

        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
        System.out.println(trabajador.getEdad());

    }
}

        class Persona {
            int edad;
            String nombre;
            String telefono;
        }
        class Cliente extends Persona {
            boolean credito;

            public int getEdad() {
                return this.edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }

            public String getNombre() {
                return "nombre " + this.nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public String getTelefono() {
                return "el telefono es " + this.telefono;
            }

            public void setTelefono(String telefono) {
                this.telefono = telefono;
            }

            public boolean isCredito() {
                return this.credito;
            }

            public void setCredito(Boolean credito) {
                this.credito = credito;
            }
        }

            class Trabajador extends Persona {
                String salario;


            public String getSalario(){
                return "el salario es " +this.salario;
            }
            public void setSalario(String salario){
                this.salario = salario;
            }
                public String getTelefono() {
                    return "el telefono es " + this.telefono;
                }

                public void setTelefono(String telefono) {
                    this.telefono = telefono;
                }
                public String getNombre() {
                    return "nombre " + this.nombre;
                }

                public void setNombre(String nombre) {
                    this.nombre = nombre;
                }
                public int getEdad() {
                    return this.edad;
                }

                public void setEdad(int edad) {
                    this.edad = edad;
                }
            }


