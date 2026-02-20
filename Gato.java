public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("O gato "+nome+" está fazendo miau!");
    }
}
