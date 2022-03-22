import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    // instance variables
    private String name;

    private List<Pokemon> pokemons;
    private FirePokemon charizard;/*🔥*/
    private WaterPokemon blastoise;/*🌊*/
    private GrassPokemon venusaur;/*🌿*/
    private GrassPokemon ditto;/*🌿*/
    private ElectricPokemon raichu;/*⚡*/
    private WaterPokemon gyarados;/*🌊*/

    public PokemonTrainer(String name) {
        this.name = name;
        this.charizard = new FirePokemon("Charizard", 40, 78, "wood", "");
        this.blastoise = new WaterPokemon("Blastoise", 40, 79, "fish", "");
        this.venusaur = new GrassPokemon("Venusaur", 40, 80, "plant", "");
        this.ditto = new GrassPokemon("Ditto", 40, 48, "plant", "");
        this.raichu = new ElectricPokemon("Raichu", 40, 60, "spark", "");
        this.gyarados = new WaterPokemon("Gyarados", 40, 95, "fish", "");
        this.pokemons = Arrays.asList(charizard, blastoise, venusaur, ditto, raichu, gyarados);
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public void setDitto(GrassPokemon ditto) {
        this.ditto = ditto;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }
}
