package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML private ImageView playButton;
    @FXML private ImageView nextButton;
    @FXML private ImageView backButton;
    @FXML private ImageView songImage;
    @FXML private ImageView volumeButton;

    @FXML private Label songName;
    @FXML private Label timerMusic;
    @FXML private Label timeOfSong;

    @FXML private Slider musicSlider;
    @FXML private Slider volumeSlider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
