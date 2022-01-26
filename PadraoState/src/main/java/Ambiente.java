public class Ambiente {

    private String nomeDesenvolvedor;
    private AmbienteEstado estado;

    public Ambiente() {

    }


    public String commit() {
        return estado.commit(this);
    }


    public String merge() {
        return estado.merge(this);
    }


    public String gitPull() {
        return estado.gitPull(this);
    }

    public String getNomeDesenvolvedor() {
        return nomeDesenvolvedor;
    }

    public void setNomeDesenvolvedor(String nomeDesenvolvedor) {
        this.nomeDesenvolvedor = nomeDesenvolvedor;
    }

    public AmbienteEstado getEstado() {
        return estado;
    }

    public void setEstado(AmbienteEstado estado) {
        this.estado = estado;
    }

    public Ambiente(String nomeDesenvolvedor, AmbienteEstado estado) {
        this.nomeDesenvolvedor = nomeDesenvolvedor;
        this.estado = estado;
    }
}
