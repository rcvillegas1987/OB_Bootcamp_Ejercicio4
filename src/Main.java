import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Sentencia IF
        int numeroIf = 5;

        if (numeroIf > 0) {
            System.out.println("Numero Positivo");
        }else if(numeroIf<0){
            System.out.println("numero Negativo");
        }else{
            System.out.println("Numero igual a cero");
        }
        //CICLO WHILE
        int numeroWhile=0;
        while(numeroWhile<3)
        {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        //CICLO DO-WHILE
        do{
            System.out.println("Ciclo do-while " + numeroIf);
            numeroIf++;
        }while(numeroIf<=5);

        //CICLO FOR
        int numeroFor=0;
        for(numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("ciclo for : "+numeroFor);
        }
        //CICLO SWITCH
        //
        String estacion="ve3rano";
        switch (estacion){
            case "verano":
                System.out.println("La estación del anio es : " +estacion);
                break;
            case "invierno":
                System.out.println("La estación del anio es : " +estacion);
                break;
            case "otoño":
                System.out.println("La estación del anio es : " +estacion);
                break;
            case "primavera":
                System.out.println("La estación del anio es : " +estacion);
                break;
            default:
                System.out.println("Ingreso una estacion incorrecta");

        }
    }
}