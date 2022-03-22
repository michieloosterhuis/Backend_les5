import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {

    // instance variables
    PokemonTrainer brock;

    public PokemonGymOwner() {
        super("brock");
        this.brock = new PokemonTrainer("Brock");
    }

    public List<Pokemon> getPokemonList() {
        return brock.getPokemons();
    }

    public PokemonTrainer getBrock() {
        return brock;
    }
}
