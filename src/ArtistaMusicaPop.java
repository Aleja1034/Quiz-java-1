public class ArtistaMusicaPop {
    /* Atributos*/

    String nombre;
    int año_de_nacimiento;
    double estatura;

    public ArtistaMusicaPop(String nombre, int año_de_nacimiento, double estatura) {
        this.nombre = nombre;
        this.año_de_nacimiento = año_de_nacimiento;
        this.estatura = estatura;

        /**
         * Método constructor para inicializar la clase
         * @para nombre el nombre de la artista
         * @para año_de_nacimiento el año en que nacio el/la artista
         * @para estatura la estatura de la/el artista
         *
         */

    }

    void cantar(){
        System.out.println("Soy "+ nombre + " nací el 5 de mayo de " + año_de_nacimiento +" y soy de estatura alta, mido " + estatura +" soy una cantante reconocida por mí gran voz.");
    }
}