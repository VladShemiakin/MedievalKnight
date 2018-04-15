package demo.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class Weapon {

    private StringProperty name;
    private IntegerProperty additionalAttack;
    private IntegerProperty additionalDefense;

    public Weapon(StringProperty name, IntegerProperty additionalAttack, IntegerProperty additionalDefense) {
        this.name = name;
        this.additionalAttack = additionalAttack;
        this.additionalDefense = additionalDefense;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getAdditionalAttack() {
        return additionalAttack.get();
    }

    public IntegerProperty additionalAttackProperty() {
        return additionalAttack;
    }

    public void setAdditionalAttack(int additionalAttack) {
        this.additionalAttack.set(additionalAttack);
    }

    public int getAdditionalDefense() {
        return additionalDefense.get();
    }

    public IntegerProperty additionalDefenseProperty() {
        return additionalDefense;
    }

    public void setAdditionalDefense(int additionalDefense) {
        this.additionalDefense.set(additionalDefense);
    }
}
