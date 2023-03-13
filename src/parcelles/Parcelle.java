package parcelles;

import java.util.Collection;
import java.util.LinkedList;

import activites.Activite;

public class Parcelle
{
    private int numero;
    private final String section;
    private final double superficie;
    private final Collection<Activite> activites;

    public Parcelle(int numero, String section, double superficie)
    {
        this.numero = numero;
        this.section = section;
        this.superficie = superficie;
        this.activites = new LinkedList<>();
    }

    public final int getNumero() { return this.numero; }

    public final void setNumero(int numero) throws NumeroNegatif
    {
        if (numero < 0)
            throw new NumeroNegatif(numero);
        this.numero = numero;
    }

    public final String getSection() { return this.section; }

    public final double getSuperficie() { return this.superficie; }

    public final Collection<Activite> getActivites() { return this.activites; }

    public final Activite getActivitePlusChere() throws AucuneActivite
    {
        Activite activite = null;
        double plusCher = 0.D;
        for (Activite a : this.activites)
            if (a.getCoutAnnuel() > plusCher)
            {
                activite = a;
                plusCher = activite.getCoutAnnuel();
            }
        if (activite == null)
            throw new AucuneActivite();
        return activite;
    }

    @Override
    public final String toString()
    {
        StringBuilder str = new StringBuilder("Parcelle : Section : ");
        str.append(this.section);
        str.append(", Numéro = ");
        str.append(this.numero);
        return str.toString();
    }
}