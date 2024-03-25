public class TesteFabricaCarros {
    public static void main(String[] args) {
        AbstractFactory fabricaEsportiva = new CarroEsportivoFactory();
        Motor motorEsportivo = fabricaEsportiva.criarMotor();
        Carroceria carroceriaEsportiva = fabricaEsportiva.criarCarroceria();

        motorEsportivo.ligar();
        carroceriaEsportiva.pintar();

        System.out.println();
        
        AbstractFactory fabricaEconomica = new CarroEconomicoFactory();
        Motor motorEconomico = fabricaEconomica.criarMotor();
        Carroceria carroceriaEconomica = fabricaEconomica.criarCarroceria();

        motorEconomico.ligar();
        carroceriaEconomica.pintar();
    }
}