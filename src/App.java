public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n");
        System.out.println("-----------------------------------------------");

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        System.out.println(basico);
        System.out.println("\nAbastencendo carro basico com gasolina");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        basico.viaja(150);
        System.out.println(basico);

        System.out.println("-----------------------------------------------");

        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        System.out.println(esportivo);
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 55);
        esportivo.viaja(250);
        System.out.println(esportivo);

        System.out.println("-----------------------------------------------");

        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);
        System.out.println(utilitario);
        System.out.println("\nAbastencendo carro utilitario com diesel");
        utilitario.abastece(TipoCombustivel.DIESEL, 55);
        utilitario.viaja(350);
        System.out.println(utilitario);
    }
}
