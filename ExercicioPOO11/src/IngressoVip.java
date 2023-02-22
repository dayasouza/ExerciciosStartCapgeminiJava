public class IngressoVip extends Ingresso {

    private float valorAdicional = 10.0f;

    public IngressoVip(float valorIngresso, float valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public float IngressoVip(float valorIngresso, float valor){
        return valorIngresso + valorAdicional;
    }
}
