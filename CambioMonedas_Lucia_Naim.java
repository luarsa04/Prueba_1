package com.iescamp;

//Creado por Lucia y Naim

public class CambioMonedas_Lucia_Naim {
        //Funciones hechas por Naim
    /**
     * Return ConsoleReader para saber que tipo de moneda tiene
     *
     * @param tip_moneda Array pararelo de tipo String
     * @return La el tipo de moneda que quiere el usuario
     */
    public static void Define_Monedas(String[] tip_moneda) {
        System.out.println("Las monedas que tienes son");
        for (int i = 0; i < tip_moneda.length; i++) {
            System.out.println(tip_moneda[i]);
        }
    }

    /**
     * Return un string para saber las monedas y valor
     *
     * @param tip_moneda Array pararelo de tipo String
     * @param cantidad Array pararelo de tipo double
     * @return la cantidad y tipo de monedas
     */

    public static void cambio_Monedas(String[] tip_moneda , double[] cantidad, double[] valor) {
        for (int i = 0; i < tip_moneda.length; i++) {
            System.out.println("Cuántas monedas quieres cambiar de " + tip_moneda[i] + " a euros?");
            double cant = ConsoleReader.readDouble();
            cantidad[i] = cant;
            System.out.println("Y cuánto vale 1 " + tip_moneda[i] + " en euros?");
            double Valor = ConsoleReader.readDouble();
            valor[i] = Valor;
        }
    }

    /**
     * Return un double y un string para averiguar el cambio de moneda de la moneda a €
     *
     * @param tip_moneda Array pararelo de tipo String
     * @param cantidad Array pararelo de tipo double
     * @param valor Array pararelo de tipo double
     * @return la convercion de monedas
     */

    public static void Convercion(String[] tip_moneda, double[] valor,double[] cantidad) {
        for (int i = 0; i < tip_moneda.length; i++) {
            double resultado = cantidad[i] * valor[i];
            System.out.printf("El valor de %s a euros es %.2f%n", tip_moneda[i], resultado);
        }
    }

    //Main hecho por Lucia
    public static void main(String[] args) {

        //1€ ES -->  Dolares = 0,95    Yenes = 0,0062    Libras=1,21
        String[] tip_moneda =new String[] {"Dolares" ,"Yenes","Libras"};
        double[] cantidad = new double[3];
        double[] valor = new double[3];
        int opcion;

        do {
            System.out.println("--- Menú Principal ---");
            System.out.println("1. Define Monedas");
            System.out.println("2. Cambio Monedas");
            System.out.println("3. Convercion");
            System.out.println("4. Salida");
            opcion = ConsoleReader.readInt();

            switch (opcion) {
                case 1:
                    Define_Monedas(tip_moneda);
                    break;
                case 2:
                    cambio_Monedas(tip_moneda , cantidad, valor);
                    break;
                case 3:
                    Convercion(tip_moneda , valor, cantidad);
                    break;
                case 4:
                    System.out.println("Saliendo");
            }

        } while (opcion !=4);
    }
}