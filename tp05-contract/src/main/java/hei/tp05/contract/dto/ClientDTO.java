package hei.tp05.contract.dto;

/**
 * Created by thiba on 31/01/2017.
 */
public class ClientDTO {

    private String prenom;
    private String nom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }

    public ClientDTO(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public ClientDTO() {
    }
}
