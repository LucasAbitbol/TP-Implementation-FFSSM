/**
 * @(#) Plongee.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Plongee {

    public Site lieu;

    public Moniteur chefDePalanquee;

    public LocalDate date;

    public int profondeur;

    public int duree;

    public Set<Plongeur> PlongeursParticipants = new HashSet<Plongeur>();

    public Plongee(Site lieu, Moniteur chefDePalanquee, LocalDate date, int profondeur, int duree) {
        this.lieu = lieu;
        this.chefDePalanquee = chefDePalanquee;
        this.date = date;
        this.profondeur = profondeur;
        this.duree = duree;
    }

    public void ajouteParticipant(Plongeur participant) {
        
        if (!PlongeursParticipants.contains(participant)) {
        PlongeursParticipants.add(participant); }

    }

    public LocalDate getDate() {
        return date;
    }

    public boolean estConforme() {
        
        for (Plongeur p : PlongeursParticipants) {
            int nbLicence = p.lesLicences.size();
            for (int i = nbLicence - 1; i > 0; i--) {
                if (p.lesLicences.get(i).estValide(this.getDate())) {
                    break;
                }
            }
            return false;
        }
        return true;

    }

    public Site getLieu() {
        return lieu;
    }

    public Moniteur getChefDePalanquee() {
        return chefDePalanquee;
    }

    public int getProfondeur() {
        return profondeur;
    }

    public int getDuree() {
        return duree;
    }

    
    

}
