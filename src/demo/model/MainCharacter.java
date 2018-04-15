package demo.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.image.Image;

public class MainCharacter {

    private IntegerProperty attack;
    private IntegerProperty defense;
    private Image characterHeadImage;
    private Image characterBodyImage;
    private Image characterLegsImage;
    private Image characterBootsImage;
    private Image characterHandsImage;
    private Image characterShieldImage;
    private Image characterSwordImage;
    private Image characterFirstBracerImage;
    private Image characterSecondBracerImage;

    public MainCharacter(){
        attack = new SimpleIntegerProperty(23);
        defense = new SimpleIntegerProperty(31);
        characterBodyImage = new Image("file:../resources/images/body.jpg");
        characterHeadImage = new Image("file:../resources/images/head.jpg");
        characterLegsImage = new Image("file:../resources/images/legs.jpg");
        characterBootsImage = new Image("file:../resources/images/boots.jpg");
        characterHandsImage = new Image("file:../resources/images/hands.jpg");
        characterShieldImage = new Image("file:../resources/images/shield.jpg");
        characterSwordImage = new Image("file:../resources/images/sword.jpg");
        characterFirstBracerImage = new Image("file:../resources/images/bracer1.jpg");
        characterSecondBracerImage = new Image("file:../resources/images/bracer2.jpg");
    }

    public int getDefense() {
        return defense.get();
    }

    public IntegerProperty defenseProperty() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense.set(defense);
    }

    public int getAttack() {
        return attack.get();
    }

    public IntegerProperty attackProperty() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack.set(attack);
    }

    public Image getCharacterHeadImage() {
        return characterHeadImage;
    }

    public void setCharacterHeadImage(Image characterHeadImage) {
        this.characterHeadImage = characterHeadImage;
    }

    public Image getCharacterBodyImage() {
        return characterBodyImage;
    }

    public void setCharacterBodyImage(Image characterBodyImage) {
        this.characterBodyImage = characterBodyImage;
    }

    public Image getCharacterLegsImage() {
        return characterLegsImage;
    }

    public void setCharacterLegsImage(Image characterLegsImage) {
        this.characterLegsImage = characterLegsImage;
    }

    public Image getCharacterHandsImage() {
        return characterHandsImage;
    }

    public void setCharacterHandsImage(Image characterHandsImage) {
        this.characterHandsImage = characterHandsImage;
    }

    public Image getCharacterShieldImage() {
        return characterShieldImage;
    }

    public void setCharacterShieldImage(Image characterShieldImage) {
        this.characterShieldImage = characterShieldImage;
    }

    public Image getCharacterSwordImage() {
        return characterSwordImage;
    }

    public void setCharacterSwordImage(Image characterSwordImage) {
        this.characterSwordImage = characterSwordImage;
    }

    public Image getCharacterFirstBracerImage() {
        return characterFirstBracerImage;
    }

    public void setCharacterFirstBracerImage(Image characterFirstBracerImage) {
        this.characterFirstBracerImage = characterFirstBracerImage;
    }

    public Image getCharacterSecondBracerImage() {
        return characterSecondBracerImage;
    }

    public void setCharacterSecondBracerImage(Image characterSecondBracerImage) {
        this.characterSecondBracerImage = characterSecondBracerImage;
    }

    public Image getCharacterBootsImage() {
        return characterBootsImage;
    }

    public void setCharacterBootsImage(Image characterBootsImage) {
        this.characterBootsImage = characterBootsImage;
    }
}
