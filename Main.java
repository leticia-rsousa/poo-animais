import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Mel"));
        animais.add(new Cachorro("Nick"));
        animais.add(new Gato("Nescau"));
        animais.add(new Gato("Pipoca"));

        for (Animal animal : animais) {
            animal.chamar();
            animal.fazerSom();
            animal.dormir();
        }
    }
}
