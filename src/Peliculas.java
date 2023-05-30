
public class Peliculas {
    String nombre;
    String genero;
    String director;
    int fecha_E;

    public Peliculas(String nombre, String genero, String director, int fecha_E) {
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.fecha_E = fecha_E;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getFecha_E() {
        return fecha_E;
    }

    public void setFecha_E(int fecha_E) {
        this.fecha_E = fecha_E;
    }

    public void imprimir_Datos(){
        System.out.println(this.nombre);
        System.out.println(this.director);
        System.out.println(this.genero);
        System.out.println(this.fecha_E);
    }
}
