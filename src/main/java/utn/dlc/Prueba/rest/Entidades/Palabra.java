package utn.dlc.Prueba.rest.Entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "palabras")
public class Palabra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descrip;
    private int cant_docs;
    private int tfmax;

    @OneToMany(mappedBy = "id")
    private List<Documento> documentos;

    public Palabra(int id, String descrip, int cant) {
        this.id = id;
        this.descrip = descrip;
        this.cant_docs = cant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getCant() {
        return cant_docs;
    }

    public void setCant(int cant) {
        this.cant_docs = cant;
    }

    public int getTfmax() {
        return tfmax;
    }

    public void setTfmax(int tfmax) {
        this.tfmax = tfmax;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    @Override
    public String toString() {
        return "Palabra{" +
                "id=" + id +
                ", descripcion='" + descrip + '\'' +
                ", cantidad =" + cant_docs +
                '}';
    }
}
