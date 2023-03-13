package parcelles;

public class NumeroNegatif extends Exception
{
    private static final String MESSAGE = "Un numéro de parcelle ne peut être négatif.";

    private final int numero;

    public NumeroNegatif(int numero)
    {
        super(MESSAGE);
        this.numero = numero;
    }

    public final int getNumero() { return this.numero; }
}
