public class CarroEconomicoFactory implements AbstractFactory {
    public Motor criarMotor() {
        return new MotorEconomico();
    }
    public Carroceria criarCarroceria() {
        return new CarroceriaEconomica();
    }
}
