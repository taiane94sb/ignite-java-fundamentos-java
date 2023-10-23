package conta;

public class TesteContaBancaria {

    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();
        // contaBancaria1.numero = "1234";
        // contaBancaria1.titular = "Maria";
        // contaBancaria1.saldo = 100;
        // System.out.println(contaBancaria1.saldo);
        contaBancaria1.setNumero("1234");
        contaBancaria1.setTitular("Maria");
        // contaBancaria1.setSaldo(100);
        System.out.println(contaBancaria1.getSaldo());

        contaBancaria1.depositar(400);
        // System.out.println(contaBancaria1.saldo);
        System.out.println(contaBancaria1.getSaldo());

        contaBancaria1.sacar(200);
        // System.out.println(contaBancaria1.saldo);
        System.out.println(contaBancaria1.getSaldo());
    }
    
}
