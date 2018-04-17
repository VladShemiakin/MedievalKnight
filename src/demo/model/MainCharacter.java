package demo.model;

import javafx.scene.image.Image;

import java.util.List;

public class MainCharacter {

    private int attack;
    private int defense;

    private Weapon helmet;
    private Weapon armor;
    private Weapon pants;
    private Weapon boots;
    private Weapon shield;
    private Weapon gloves;
    private Weapon sword;
    private Weapon bracer1;
    private Weapon bracer2;

    private static final Weapon DEFAULT_HELMET = new Weapon("Default", 0,0, WeaponType.HELMET, new Image("file:../resources/images/characterDefaultImages/head.jpg"));
    private static final Weapon DEFAULT_ARMOR = new Weapon("Default", 0,0, WeaponType.ARMOR, new Image("file:../resources/images/characterDefaultImages/body.jpg"));
    private static final Weapon DEFAULT_PANTS = new Weapon("Default", 0,0, WeaponType.PANTS, new Image("file:../resources/images/characterDefaultImages/legs.jpg"));
    private static final Weapon DEFAULT_BOOTS = new Weapon("Default", 0,0, WeaponType.BOOTS, new Image("file:../resources/images/characterDefaultImages/boots.jpg"));
    private static final Weapon DEFAULT_SHIELD = new Weapon("Default", 0,0, WeaponType.SHIELD, new Image("file:../resources/images/characterDefaultImages/shield.jpg"));
    private static final Weapon DEFAULT_GLOVES = new Weapon("Default", 0,0, WeaponType.GLOVES, new Image("file:../resources/images/characterDefaultImages/hands.jpg"));
    private static final Weapon DEFAULT_SWORD = new Weapon("Default", 0,0, WeaponType.SWORD, new Image("file:../resources/images/characterDefaultImages/sword.jpg"));
    private static final Weapon DEFAULT_BRACER_1 = new Weapon("Default", 0,0, WeaponType.BRACER, new Image("file:../resources/images/characterDefaultImages/bracer1.jpg"));
    private static final Weapon DEFAULT_BRACER_2 = new Weapon("Default", 0,0, WeaponType.BRACER, new Image("file:../resources/images/characterDefaultImages/bracer2.jpg"));

    private List<Weapon> inventory;

    public MainCharacter(){
        attack = 23;
        defense = 31;
        helmet = DEFAULT_HELMET;
        armor = DEFAULT_ARMOR;
        pants = DEFAULT_PANTS;
        boots = DEFAULT_BOOTS;
        shield = DEFAULT_SHIELD;
        gloves = DEFAULT_GLOVES;
        sword = DEFAULT_SWORD;
        bracer1 = DEFAULT_BRACER_1;
        bracer2 = DEFAULT_BRACER_2;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Weapon getHelmet() {
        return helmet;
    }

    public void setHelmet(Weapon helmet) {
        this.helmet = helmet;
    }

    public Weapon getArmor() {
        return armor;
    }

    public void setArmor(Weapon armor) {
        this.armor = armor;
    }

    public Weapon getPants() {
        return pants;
    }

    public void setPants(Weapon pants) {
        this.pants = pants;
    }

    public Weapon getBoots() {
        return boots;
    }

    public void setBoots(Weapon boots) {
        this.boots = boots;
    }

    public Weapon getShield() {
        return shield;
    }

    public void setShield(Weapon shield) {
        this.shield = shield;
    }

    public Weapon getGloves() {
        return gloves;
    }

    public void setGloves(Weapon gloves) {
        this.gloves = gloves;
    }

    public Weapon getSword() {
        return sword;
    }

    public void setSword(Weapon sword) {
        this.sword = sword;
    }

    public Weapon getBracer1() {
        return bracer1;
    }

    public void setBracer1(Weapon bracer1) {
        this.bracer1 = bracer1;
    }

    public Weapon getBracer2() {
        return bracer2;
    }

    public void setBracer2(Weapon bracer2) {
        this.bracer2 = bracer2;
    }

    /////////////////////////////////////////////////////////////
    // Methods to set default weapons
    ////////////////////////////////////////////////////////////
    public void setHelmetByDefault(){
        this.helmet = DEFAULT_HELMET;
    }

    public void setArmorByDefault(){
        this.armor = DEFAULT_ARMOR;
    }

    public void setPantsByDefault(){
        this.pants = DEFAULT_PANTS;
    }

    public void setBootsByDefault(){
        this.boots = DEFAULT_BOOTS;
    }

    public void setGlovesByDefault(){
        this.gloves = DEFAULT_GLOVES;
    }

    public void setShieldByDefault(){
        this.shield = DEFAULT_SHIELD;
    }

    public void setSwordByDefault(){
        this.sword = DEFAULT_SWORD;
    }

    public void setFirstBracerByDefault(){
        this.bracer1 = DEFAULT_BRACER_1;
    }

    public void setSecondBracerByDefault(){
        this.bracer2 = DEFAULT_BRACER_2;
    }
}
