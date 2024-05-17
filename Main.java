
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        Pokedex pokedexEntrenador2 = new Pokedex();
        Pokedex pokedexEntrenador1 = new Pokedex();

        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico");
        pokedexEntrenador1.capturarPokemon(pikachu);

        Pokemon charmander = new Pokemon("Charmander", "Fuego");
        pokedexEntrenador1.capturarPokemon(charmander);

        System.out.println("Entrenador 1:");
        System.out.println("***************************");
        pokedexEntrenador1.mostrarCantidadPokemonPorTipo();
        System.out.println("***************************");
        Pokedex.mostrarTotalEntrenadores();
        
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta");
        pokedexEntrenador2.capturarPokemon(bulbasaur);

        Pokemon pidgey = new Pokemon("Pidgey", "Volador");
        pokedexEntrenador2.capturarPokemon(pidgey);

        
        System.out.println("\nEntrenador 2:");
        System.out.println("***************************");
        pokedexEntrenador2.mostrarCantidadPokemonPorTipo();
        System.out.println("***************************");
        Pokedex.mostrarTotalEntrenadores();

        
        System.out.println("\nIntercambio de Pokémon entre los entrenadores...");
        pokedexEntrenador1.intercambiarPokemon(bulbasaur, charmander); 

        
        System.out.println("\nInformación actualizada:");
        System.out.println("Entrenador 1:");
        System.out.println("***************************");
        pokedexEntrenador1.mostrarCantidadPokemonPorTipo();
        System.out.println("***************************");
        System.out.println("Entrenador 2:");
        System.out.println("***************************");
        pokedexEntrenador2.mostrarCantidadPokemonPorTipo();
        System.out.println("***************************");

        
        double mediaEntrenador1 = pokedexEntrenador1.mediaPokemon();
        double mediaEntrenador2 = pokedexEntrenador2.mediaPokemon();

        
        System.out.println("\nMedia de Pokémon por entrenador:");
        System.out.println("Entrenador 1: " + mediaEntrenador1);
        System.out.println("Entrenador 2: " + mediaEntrenador2);
    }
}