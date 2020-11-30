package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;

public class Plongeur extends Personne {
    private int Niveau;
    public ArrayList<Licence> lesLicences = new ArrayList<Licence>();

    public Plongeur(String numeroINSEE, String nom, String prenom, String adresse, String telephone, LocalDate naissance, int Niveau, GroupeSanguin gs) {
        super(numeroINSEE, nom, prenom, adresse, telephone, naissance);
        this.Niveau = Niveau;
    }
    
    public void ajouteLicence (String numero, LocalDate debut, Club club) {
        
        for (Licence l : lesLicences) {
            if (l.estValide(LocalDate.now())) {
                l.setValid(false);
            }
        }
        lesLicences.add(new Licence(this, numero, debut, Niveau, club));
    }

    public int getNiveau() {
        return Niveau;
    }


    public ArrayList<Licence> getLesLicences() {
        return lesLicences;
    }

    public String getNumeroINSEE() {
        return numeroINSEE;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public LocalDate getNaissance() {
        return naissance;
    }

    public void setNiveau(int Niveau) {
        this.Niveau = Niveau;
    }


    public void setLesLicences(ArrayList<Licence> lesLicences) {
        this.lesLicences = lesLicences;
    }

    public void setNumeroINSEE(String numeroINSEE) {
        this.numeroINSEE = numeroINSEE;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setNaissance(LocalDate naissance) {
        this.naissance = naissance;
    }
    
    
    
	
}
