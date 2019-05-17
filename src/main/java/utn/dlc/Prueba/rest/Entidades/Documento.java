package utn.dlc.Prueba.rest.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "documentos")
public class Documento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String ruta;

    public Documento(int id, String titulo, String ruta) {
        this.id = id;
        this.titulo = titulo;
        this.ruta = ruta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "Id=" + id +
                ", titulo='" + titulo + '\'' +
                ", ruta='" + ruta + '\'' +
                '}';
    }
}
