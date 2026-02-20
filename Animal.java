public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    void chamar() {
        System.out.println("Chamando o animal: " + nome);
    }

    void dormir() {
        System.out.println("O animal "+nome+" está dormindo.");
        System.out.println("---");
    }

    public abstract void fazerSom();
}
