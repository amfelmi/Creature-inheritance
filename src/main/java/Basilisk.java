public class Basilisk extends Creature {
    int health = 200;
    int power = 30;
    int posX;
    int posY;
    public Basilisk (int posX, int posY){
        //complete constructor
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public boolean isInRange(int targetPosX, int targetPosY) {
        //complete this method
        posY = posY + 2;
        int posX1 = posX + 2;
        int posX2 = posX - 2;

        return targetPosY == posY && targetPosX <= posX1 && targetPosX >= posX2;
    }
}
