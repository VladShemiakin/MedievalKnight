package demo.model;

import javafx.scene.image.Image;

public class Weapon {

    private String name;
    private int additionalAttack;
    private int additionalDefense;
    private WeaponType weaponType;
    private Image weaponImage;

    public Weapon(String name, int additionalAttack, int additionalDefense, WeaponType weaponType, Image weaponImage) {
        this.name = name;
        this.additionalAttack = additionalAttack;
        this.additionalDefense = additionalDefense;
        this.weaponType = weaponType;
        this.weaponImage = weaponImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdditionalAttack() {
        return additionalAttack;
    }

    public void setAdditionalAttack(int additionalAttack) {
        this.additionalAttack = additionalAttack;
    }

    public int getAdditionalDefense() {
        return additionalDefense;
    }

    public void setAdditionalDefense(int additionalDefense) {
        this.additionalDefense = additionalDefense;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public Image getWeaponImage() {
        return weaponImage;
    }

    public void setWeaponImage(Image weaponImage) {
        this.weaponImage = weaponImage;
    }
}
