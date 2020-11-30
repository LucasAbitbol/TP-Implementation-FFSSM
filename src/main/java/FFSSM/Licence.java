/**
 * @(#) LicencePlongeur.java
 */
package FFSSM;

import java.time.LocalDate;
import java.util.ArrayList;

public class Licence {

    public Personne possesseur;

    public String numero;

    public LocalDate delivrance;

    public Club club;

    public int niveau;

    public Boolean valide;

    public Licence(Personne possesseur, String numero, LocalDate delivrance, int niveau, Club club) {
        this.possesseur = possesseur;
        this.numero = numero;
        this.delivrance = delivrance;
        this.club = club;
        this.valide = true;
        this.niveau = niveau;
        

    }

    public Personne getPossesseur() {
        return possesseur;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getDelivrance() {
        return delivrance;
    }

    public Club getClub() {
        return club;
    }
    
    public void setValid(boolean b) {
        valide = b;
    }

    public boolean estValide(LocalDate d) {
        if (d.isBefore(delivrance.plusYears(1))) {
            return true;

        } else {
            return false;
        }

    }

}
