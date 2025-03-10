public class Motor {
    private TipoCombustivel tipoCombustivel;
    private double consumo; 
    private double kmPercorridos;

    public Motor(TipoCombustivel tipoCombustivel, double consumoInicial) {
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumoInicial;
        this.kmPercorridos = 0;
    }

    public double getConsumo() {
        return consumo;
    }

    public int combustivelNecessario(int distancia) {
        return (int) Math.ceil(distancia / consumo);
    }

    public void percorre(int distancia) {
        kmPercorridos += distancia;
    }

    public void atualizarConsumo() {
        int reducao = (int) (kmPercorridos / 5000);
        consumo = Math.max(10, 20 - reducao); 
    }

    @Override
    public String toString() {
        return "Motor [Tipo=" + tipoCombustivel + ", Consumo=" + consumo + " Km/litro]";
    }
}
