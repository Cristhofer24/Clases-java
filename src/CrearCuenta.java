public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta();
        miCuenta.saldo = 1000;
        System.out.println(miCuenta.saldo);
        miCuenta.saldo += 100;
        System.out.println(miCuenta.saldo);

        Cuenta segundaCuenta = miCuenta;
        segundaCuenta.saldo = 50;
        System.out.println("Saldo Primera Cuenta: " + miCuenta.saldo);
        System.out.println("Saldo segunda Cuenta: " + segundaCuenta.saldo);
//        Cuenta miCuenta2 = new Cuenta();
//        miCuenta2.saldo = 2000;
//        System.out.println(miCuenta2.saldo);
    }
}