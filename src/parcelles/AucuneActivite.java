package parcelles;

public class AucuneActivite extends Exception
{
    private static final String MESSAGE = "La parcelle n'a pas d'activité enregistrée.";

    public AucuneActivite()
    {
        super(MESSAGE);
    }
}
