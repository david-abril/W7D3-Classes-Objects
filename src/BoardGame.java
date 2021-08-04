// TTS: Week 7, Day 3, Assignment 2:
// Create a Custom Class (anything you want - car, phone, holiday, etc)

public class BoardGame {

// Minimum 3 private instance variables:
    private static String gameName;
    private static String maker;
    private static int minPlayers;

// An empty constructor:
    public BoardGame (){
    }

// A constructor that uses only 2 of your 3 variables:
    public BoardGame(String gameName, String maker){
        this.gameName = gameName;
        this.maker = maker;
    }

// A constructor that uses all 3 of your instance variables:
    public BoardGame(String gameType, String maker, int maxPlayers) {
        this.gameName = gameName;
        this.maker = maker;
        this.minPlayers = minPlayers;
    }
// Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables:
    public String getGameName(){
        return gameName;
    }

    public String getMaker(){
        return maker;
    }

    public int getMinPlayers(){
        return minPlayers;
    }

// A method that returns a Boolean:
    public boolean playableForTwo(){
        return (minPlayers == 2);
    }

// A method that returns a String:
    public String gamePrompt(String gameName){
        return ("Want to play " + gameName + "?");
    }

}
