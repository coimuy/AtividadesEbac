public class CarroEsportivoFactory implements AbstractFactory {
    public Motor criarMotor() {
        return new MotorEsportivo();
    }
    public Carroceria criarCarroceria() {
        return new CarroceriaEsportiva();
    }
}
