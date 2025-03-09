public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);
        System.out.println(esportivo);

        System.out.println("\nAbastencendo carros");
        System.out.println("Basico: " + basico.abastece(TipoCombustivel.GASOLINA, 55) + " litros.");
        System.out.println("Esportivo: " + esportivo.abastece(TipoCombustivel.GASOLINA, 45) + " litros.");

        System.out.println("\nViajando com o carros:");

        basico.viaja(250);
        basico.viaja(150);
        System.out.println(basico);
        System.out.println("\n");

        esportivo.viaja(200);
        esportivo.viaja(200);
        System.out.println(esportivo);
        System.out.println("\n");
    }
}
