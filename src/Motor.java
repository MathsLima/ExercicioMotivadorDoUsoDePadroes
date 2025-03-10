public class Motor {
    private TipoCombustivel tipoCombustivel;
    private int consumo; 
    private int quilometragem;

    public Motor(TipoCombustivel tipoCombustivel, int consumoInicial) {
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumoInicial;
        this.quilometragem = 0;
    }

    public int getConsumo() {
        return consumo;
    }

    public int combustivelNecessario(int distancia) {
        return (int) Math.ceil(distancia / consumo);
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    public void atualizarConsumo() {
        int reducao = (int) (quilometragem / 5000);
        consumo = Math.max(10, 20 - reducao); 
    }

    @Override
    public String toString() {
        return "Motor [Tipo=" + tipoCombustivel + ", Consumo=" + consumo + " Km/litro]";
    }
}
