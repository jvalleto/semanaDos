
    public class Jugador {
        private String nombre;
        private int edad;
        private String posicion;
        private int numeroCamiseta;
        private String equipo;


    public Jugador (String nombre, int edad, String posicion, int numeroCamiseta, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
        this.equipo = equipo;
}
    public String getNombre ()
        { return nombre; }
          
    public void setNombre(String nombre)
        { this.nombre = nombre; }

        public int getedad ()
        { return edad; }
          
    public void setedad(int edad)
        { this.edad = edad; }

        public String getposicion ()
        { return posicion; }
          
    public void setposicion(String posicion)
        { this.posicion = posicion; }

        public int getnumeroCamiseta ()
        { return numeroCamiseta; }
          
    public void setnumeroCamiseta(int numeroCamiseta)
        { this.numeroCamiseta = numeroCamiseta; }

        public String equipo()
        { return equipo; }
          
    public void setequipo(String equipo)
        { this.equipo = equipo; }

        public void entrenar(){
            System.out.println(nombre + " esta entrenado.");

        }

        public void jugandopartido(){
            System.out.println(nombre + " esta jugando un partido.");
        }






    }





        
    


    

    
    
        
  


