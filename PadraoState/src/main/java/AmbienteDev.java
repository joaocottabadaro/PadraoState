public class AmbienteDev implements AmbienteEstado {
    public AmbienteDev() {};
    private static AmbienteDev instance = new AmbienteDev();
    public static AmbienteDev getInstance() {
        return instance;
    }

    @Override
    public String commit(Ambiente ambiente) {
        return "Commit não deve ser feito na branch";
    }

    @Override
    public String merge(Ambiente ambiente) {
        return "Merge feito para o ambiente Homolog";
    }

    @Override
    public String gitPull(Ambiente ambiente) {
        return "Git pull origin dev";
    }

    @Override
    public String getEstado() {
        return "Dev";
    }
}
