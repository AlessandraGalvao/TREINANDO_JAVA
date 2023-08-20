public class fruta{
    /**
     * @param args
     */
    public static String[] addFruta (int n, String lista[], String novaFruta)
    {
        int i;
        String novaArray[] =  new String [n+1];
       
        for (i=0; i< n; i++)
        {
            novaArray[i]=lista[i];
        }
        novaArray[n]=novaFruta;
    return novaArray;
    }

    /**
     * @param lista
     */
    public static void imprimeLista(String lista[])
    {
        for (String item: lista){
            System.out.println(item);
        }
    }
    /**
     * @param args
     */
    public static void main(String[]args){
        String frutas[] = {"laranja", "pera", "uva", "banana"};

        //imprimeLista(fruta);        

        for (String item: frutas){
            System.out.println(item);
        }

        String newFruta = "melancia";
        frutas = addFruta(4, frutas, newFruta);

        for (String item: frutas){
            System.out.println(item);
        }
        //imprimeLista(fruta);

    }

    @Override
    public String toString() {
        return "fruta []";
    }
}
