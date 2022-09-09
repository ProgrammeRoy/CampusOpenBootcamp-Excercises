public class EjercicioTema4 {
    public static void main(String[] args) {
        //First
        int numberoIf = 3;
        if (numberoIf>0){
            System.out.println("Es positivo");
        } else if (numberoIf<0){
            System.out.println("Es Negativo");
        } else {
            System.out.println("Es Cero");
        }

        //Second
        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Third
        int numeroDoWhile = 0;
        do{
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile>3);

        //Four
        int numeroFor = 0;
        for (int i = 0; numeroFor<= 3; i++){
            System.out.println(numeroFor);
            numeroFor++;
        }
        //Five
        String estacion = "PRIMAVERA";
        switch (estacion){
            case "VERANO":
                System.out.println("Estacion: Verano");
                break;
            case "OTOÑO":
                System.out.println("Estacion: Otoño");
                break;
            case "INVIERNO":
                System.out.println("Estacion: Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Estacion: Primavera");
                break;
            default:
                System.out.println("No es una Estacion");
                break;
        }
    }
}
