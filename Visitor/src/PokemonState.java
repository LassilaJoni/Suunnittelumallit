public interface PokemonState {
    public void attack();
    public void run();
    public void rest();
    public void accept(PokemonVisitor visitor);
}
