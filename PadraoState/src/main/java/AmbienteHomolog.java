public class AmbienteHomolog implements AmbienteEstado{


    public AmbienteHomolog() {};
    private static AmbienteHomolog instance = new AmbienteHomolog();
    public static AmbienteHomolog getInstance() {
        return instance;
    }

    @Override
    public String commit(Ambiente ambiente) {
        return "Realizado commit para o ambiente homolog";
    }

    @Override
    public String merge(Ambiente ambiente) {
        return "Merge feito para o ambiente release";
    }

    @Override
    public String gitPull(Ambiente ambiente) {
        return "Git pull origin dev";
    }

    @Override
    public String getEstado() {
        return "Homolog";
    }
}
