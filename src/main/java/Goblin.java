public class Goblin extends Creature {
    int health = 80;
    int power = 15;
    int posX;
    int posY;
    public Goblin(int posX, int posY){
        //complete constructor
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public boolean isInRange(int targetPosX, int targetPosY) {
        //complete this method
        int posY1 = posY + 3;
        int posY2 = posY - 3;
        int posX1 = posX + 3;
        int posX2 = posX - 3;
        if (targetPosY == posY && targetPosX <= posX1 && targetPosX >= posX2 || targetPosX == posX && targetPosY <= posY1 && targetPosY >= posY2) {
            return true;
        }

        int sqrPosX1 = posX + 2;
        int sqrPosX2 = posX - 2;
        int sqrPosY1 = posX + 2;
        int sqrPosY2 = posX - 2;

        if (targetPosX <= sqrPosX1 && targetPosX >= sqrPosX2 && targetPosY <= sqrPosY1 && targetPosY >= sqrPosY2) {
            return true;
        }

        return false;
    }
}
