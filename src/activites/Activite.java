package activites;

import java.util.Collection;
import java.util.TreeSet;

public abstract class Activite
{
    public static final double AIDE_PAR_HECTARE = 1000.00D;

    private final String nom;
    private final Collection<Integer> semaines;
    private final double coutAnnuel;

    protected Activite(String nom, double coutAnnuel)
    {
        this.nom = nom;
        this.semaines = new TreeSet<>();
        this.coutAnnuel = coutAnnuel;
    }

    public final String getNom() { return this.nom; }

    public final Collection<Integer> getSemaines() { return this.semaines; }

    public final double getCoutAnnuel() { return this.coutAnnuel; }

    public double estimerAide(double hectares)
    {
        return hectares * AIDE_PAR_HECTARE;
    }

    public abstract double calculerEauConsommee(double hectares);

    @Override
    public final String toString()
    {
        StringBuilder str = new StringBuilder("Activité : ");
        str.append(this.nom);
        str.append(" (");
        str.append(this.coutAnnuel);
        str.append("€ par an sur ");
        str.append(this.semaines.size());
        str.append(" semaines)");
        return str.toString();
    }
}
