package model;

public class MarioCharacterReceiver {

    private String name;

    public void moveUp(){
        System.out.println(this.getName() + "move up");
    }

    public void moveLeft(){
        System.out.println(this.getName() + "move left");
    }

    public void moveDown() {
        System.out.println(this.getName() + "move down");
    }

    public void moveRight() {
        System.out.println(this.getName() + "move right");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
