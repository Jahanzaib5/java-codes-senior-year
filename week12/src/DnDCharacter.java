import java.util.Arrays;
import java.util.Random;

public class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitPoints;

    public DnDCharacter(){
        this.strength=calculateAbility();
        this.dexterity=calculateAbility();
        this.constitution=calculateAbility();
        this.intelligence=calculateAbility();
        this.wisdom=calculateAbility();
        this.charisma=calculateAbility();
        this.hitPoints = 10 + modifier(constitution);
    }

    public int getCharisma() {
        return charisma;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public int getWisdom() {
        return wisdom;
    }


    int calculateAbility(){
        int result = 0;
        int[] temp = rollDices();
        for (int i=temp.length-1; i>0; i--){
            result+=temp[i];
        }
        return result;
    }

    public int modifier(int constitution){
        return Math.floorDiv(constitution-10, 2);
    }


    private int[] rollDices(){
        int[] storeScore = new int[4];
        Random random = new Random();
        for (int i=0; i<4; i++){
            storeScore[i] = random.nextInt(6)+1;
        }
        Arrays.sort(storeScore);
        return storeScore;
    }


}
