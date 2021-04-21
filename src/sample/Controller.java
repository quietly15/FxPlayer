package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML public ImageView playButton;
    @FXML public ImageView nextButton;
    @FXML public ImageView backButton;
    @FXML public ImageView songImage;
    @FXML public ImageView volumeButton;

    @FXML public Label songName;
    @FXML public Label timerMusic;
    @FXML public Label timeOfSong;

    @FXML public Slider musicSlider;
    @FXML public Slider volumeSlider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
