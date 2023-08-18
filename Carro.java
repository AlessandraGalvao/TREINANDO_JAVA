public class Carro {
    private float consumo;
    private float nivel;

    /**
     * @param consumo
     */
    public  Carro (float consumo){
        this.consumo=consumo;
        this.nivel=0;

    }
    public void andar(float percurso){
        float litros = percurso/consumo;
        nivel -= litros;
        
    }

    public float obterCombustivel(){
        return nivel;

    }
    
    public void adcionarGasolina(float qtdLitro){
        nivel+= qtdLitro;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro(15);
        meuCarro.adcionarGasolina(20);
        meuCarro.andar(100);
        System.out.println(meuCarro.obterCombustivel());
    }



    
       
}
