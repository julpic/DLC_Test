package utn.dlc.Prueba.rest.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "posteos")

public class Posteo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_palabra;
    private int id_documento;
    private int frec;


    public Posteo(int id_palabra, int id_documento, int frec) {
        this.id_palabra = id_palabra;
        this.id_documento = id_documento;
        this.frec = frec;
    }

    public int getId_palabra() {
        return id_palabra;
    }

    public void setId_palabra(int id_palabra) {
        this.id_palabra = id_palabra;
    }

    public int getId_documento() {
        return id_documento;
    }

    public void setId_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public int getFrec() {
        return frec;
    }

    public void setFrec(int frec) {
        this.frec = frec;
    }

    @Override
    public String toString() {
        return "Posteo{" +
                "id_palabra=" + id_palabra +
                ", id_documento=" + id_documento +
                ", cantidad de veces q aparece esa palabra en el documento=" + frec +
                '}';
    }
}
