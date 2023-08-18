public class cedulas {
    /**
     * @param args
     */
    public static void main (String[] args){
        int notas[] = {100, 50, 20, 10, 5, 2, 1};
        int nota, n =notas.length;
        int valor =  576;
        System.out.println(valor);

        for (nota=0; nota<n; nota++){
            int qtnotas = valor/notas[nota];
            System.out.println (qtnotas+" nota(s) de R$"+notas[nota]+",00");
            valor = valor%notas[nota];
        }
    }
}