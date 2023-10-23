package veiculo;

public class TesteVeiculo {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();

        carro1.acelerar();
        carro1.frear();

        moto1.acelerar();
        moto1.frear();
    }
    
}
