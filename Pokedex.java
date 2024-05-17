
/**
 * Write a description of class Pokedex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pokedex {
    private static int totalEntrenadores = 0;
    private static int[] cantidadPokemonPorTipo = new int[7]; 
    
    public Pokedex() {
        totalEntrenadores++;
    }

    public void capturarPokemon(Pokemon pokemon) {
        String tipo = pokemon.getTipo();
        switch (tipo) {
            case "Agua":
                cantidadPokemonPorTipo[0]++;
                break;
            case "Fuego":
                cantidadPokemonPorTipo[1]++;
                break;
            case "Dragón":
                cantidadPokemonPorTipo[2]++;
                break;
            case "Planta":
                cantidadPokemonPorTipo[3]++;
                break;
            case "Eléctrico":
                cantidadPokemonPorTipo[4]++;
                break;
            case "Roca":
                cantidadPokemonPorTipo[5]++;
                break;
            case "Volador":
                cantidadPokemonPorTipo[6]++;
                break;
            default:
                System.out.println("Tipo de Pokémon no válido.");
        }
    }

    public void mostrarCantidadPokemonPorTipo() {
        String[] tipos = {"Agua", "Fuego", "Dragón", "Planta", "Eléctrico", "Roca", "Volador"};
        for (int i = 0; i < tipos.length; i++) {
            System.out.println("Pokémones de tipo " + tipos[i] + ": " + cantidadPokemonPorTipo[i]);
        }
    }
    
    public void intercambiarPokemon(Pokemon pokemonNuevo, Pokemon pokemonAntiguo) {
        liberarPokemon(pokemonAntiguo);
        capturarPokemon(pokemonNuevo);
    }

    public void liberarPokemon(Pokemon pokemon) {
        switch (pokemon.getTipo()) {
            case "Agua":
                cantidadPokemonPorTipo[0]--;
                break;
            case "Fuego":
                cantidadPokemonPorTipo[1]--;
                break;
            case "Dragon":
                cantidadPokemonPorTipo[2]--;
                break;
            case "Planta":
                cantidadPokemonPorTipo[3]--;
                break;
            case "Electrico":
                cantidadPokemonPorTipo[4]--;
                break;
            case "Roca":
                cantidadPokemonPorTipo[5]--;
                break;
            case "Volador":
                cantidadPokemonPorTipo[6]--;
                break;
            default:
                break;
        }
    }

    public void reiniciarPokedex() {
        for (int i = 0; i < cantidadPokemonPorTipo.length; i++) {
            cantidadPokemonPorTipo[i] = 0;
        }
        totalEntrenadores = 0;
    }

    public double mediaPokemon() {
        int totalPokemones = 0;
        for (int cantidad : cantidadPokemonPorTipo) {
            totalPokemones += cantidad;
        }
        if (totalEntrenadores == 0) {
            return 0;
        }
        return (double) totalPokemones / totalEntrenadores;
    }
    
    public static void mostrarTotalEntrenadores() {
        System.out.println("Total de entrenadores: " + totalEntrenadores);
    }
}