package co.com.sofkau.cuadrante;

import co.com.sofka.domain.generic.AggregateEvent;

public class Patrulla extends AggregateEvent<PatrullaId> {
    protected IntegrantePatrulla integrantePatrullaList;
    protected ComandantePatrulla comandantePatrulla;
    protected RemanentePatrulla remanentePatrulla;
    protected CuadranteNumero cuadranteNumero;
    protected Estado estado;

    /**
     * Instantiates a new Aggregate event.
     *
     * @param entityId the entity id
     */
    public Patrulla(PatrullaId entityId) {
        super(entityId);
    }
}
