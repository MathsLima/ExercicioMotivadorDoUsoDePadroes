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

        System.out.println("-----------------------------------------------");

        Carro SUV = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);
        System.out.println(SUV);
        System.out.println("\nAbastencendo carro SUV com gasolina");
        SUV.abastece(TipoCombustivel.FLEX, 55);
        SUV.viaja(400);
        System.out.println(SUV);

        System.out.println("-----------------------------------------------");

        Carro suvflex = new Carro("SUVFlex", TipoCombustivel.FLEX, 8, 65);
        System.out.println(suvflex);
        System.out.println("\nAbastencendo carro suvflex com gasolina");
        suvflex.abastece(TipoCombustivel.GASOLINA, 65);
        suvflex.viaja(500);
        System.out.println(suvflex);

        System.out.println("-----------------------------------------------");

        Carro econo = new Carro("Econo", TipoCombustivel.GASOLINA, 20, 55);
        System.out.println(econo);
        System.out.println("\nAbastencendo carro econo com gasolina");
        econo.abastece(TipoCombustivel.GASOLINA, 55);
        econo.viaja(500);
        System.out.println(econo);
        econo.viaja(4500);
        System.out.println(econo);
    }
}
