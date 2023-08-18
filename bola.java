public class bola {
    private String cor;
    private int circunf;
    private String material;

    /**
     * @param cor
     * @param circunf
     * @param material
    */

    public bola(String cor, int circunf, String material){
       
        this.cor = cor;
        this.circunf =circunf;
        this.material=material;
                    
    }

    public void trocaCor(String cor){
        this.cor=cor;
    }
    
    public String mostraCor(){
        return this.cor;
    }

    public static void main(String[] args){
        bola bola1= new bola("Rosa", 10, "couro");
        System.out.println(bola1.mostraCor());
        bola1.trocaCor("vermelha");
        System.out.println(bola1.mostraCor());
     
    }
}
