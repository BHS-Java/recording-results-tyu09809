public interface Results {
    int wins = 0;
    int losses = 0;
    int ties = 0;
    
    public static int getWins() {
        return wins;
    }

    public static int getLosses() {
        return losses;
    }

    public static int getTies() {
        return ties;
    }
}
