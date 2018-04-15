package demo.view;

import demo.Main;
import demo.model.MainCharacter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CharacterViewController {

    @FXML
    private Label attack;
    @FXML
    private Label defense;

    // Ссылка на главное приложение.
    private Main main;

    /**
     * Конструктор.
     * Конструктор вызывается раньше метода initialize().
     */
    public CharacterViewController() {
    }

    /**
     * Инициализация класса-контроллера. Этот метод вызывается автоматически
     * после того, как fxml-файл будет загружен.
     */
    @FXML
    private void initialize() {
        attack.setText("Атака: " + String.valueOf(new MainCharacter().getAttack()));
        defense.setText("Защита: " + String.valueOf(new MainCharacter().getDefense()));;
    }

    public void setMainApp(Main main) {
        this.main = main;
  }
}
