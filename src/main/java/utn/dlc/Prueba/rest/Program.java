package utn.dlc.Prueba.rest;

import javax.persistence.*;

public class Program {

    public static void main (String[] arg){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PruebaPU");
        EntityManager em = emf.createEntityManager();
    }

}
