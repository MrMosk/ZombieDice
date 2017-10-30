package Die;

public class Die {

    boolean dead = true;
    String[] playerRolls = new String[6];


    private String difficulty1 = "e";
    private String difficulty2 = "m";
    private String difficulty3 = "h";

    private String points = "brains";
    private String damage = "bullet";
    private String goAgain = "runner";

    private int riskOfDying = 10;
    private int riskOfDying2 = 50;
    private int riskOfDying3 = 80;


    }
//Documentation:
//
//        - die.setDifficulty(['e', 'm', 'h']) //Sets the difficulty of the die
//        - die.getDifficulty() //Returns the difficulty of the die as 'e' (easy), 'm' (medium), or 'h' (hard)
//        - die.rollDie() //Return result as 'b' (brain), 'f' (footstep), or 's' (shotgun blast)