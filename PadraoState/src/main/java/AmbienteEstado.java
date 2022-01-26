public interface AmbienteEstado {

    String commit(Ambiente ambiente);

    String merge(Ambiente ambiente);

    String gitPull(Ambiente ambiente);

    String getEstado();
}
