// Atributos: nome, idade, peso e altura
// Métodos: Envelhercer, engordar, emagrecer, crescer

public class Pessoa {
    
    public String nome;
    public  int idade;
    public  float peso;
    public  double altura;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public Pessoa(String nome, int idade, float peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void engordar (float pesoAumento){
        peso= peso+ pesoAumento;

    }

    /**
     * @param args
     */
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Joana", 12, 30,  1.50);
        System.out.println("Pessoa [nome=" + pessoa1.nome + ", idade=" + pessoa1.idade + ", peso=" + pessoa1.peso + ", altura=" + pessoa1.altura + "]");
        pessoa1.engordar(2);
        System.out.println("Novo peso: "+pessoa1.peso);
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
    }

}