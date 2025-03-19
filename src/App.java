public class App {
    public static void main(String[] args) throws Exception {

        Jugador jugador1 = new Jugador("juan", 23, "Defensa", 05, "Envigado");

        System.out.println("nombre: " + jugador1.getNombre());
        System.out.println("Edad: " + jugador1.getedad());
        System.out.println("Posicion: " + jugador1.getposicion());
        System.out.println("Numero de camiseta: " + jugador1.getnumeroCamiseta());
        System.out.println("Equipo: " + jugador1.equipo());

        jugador1.entrenar();
        jugador1.jugandopartido();

        
    }
}
