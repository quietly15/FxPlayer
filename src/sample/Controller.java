package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private final String MUSIC_FOLDER = "C:\\Users\\79265\\IdeaProjects\\FxPlayer\\src\\music";
    private int songNumber = 0;

    @FXML private ImageView pauseButton;
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

    private File[] files;
    private ArrayList<File> songsPlayList;

    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        files = new File(MUSIC_FOLDER).listFiles();
        assert files != null;

        songsPlayList = new ArrayList<>(Arrays.asList(files));

        media = new Media(songsPlayList.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        songName.setText(songsPlayList.get(songNumber).getName());
        pauseButton.setVisible(false);

        playButton.setOnMouseClicked(mouseEvent -> playMusic());
        pauseButton.setOnMouseClicked(mouseEvent -> pauseMusic());
        nextButton.setOnMouseClicked(mouseEvent -> nextSong());
        backButton.setOnMouseClicked(mouseEvent -> previousSong());
    }

    public void playMusic() {
        playButton.setVisible(false);
        pauseButton.setVisible(true);
        mediaPlayer.play();
    }

    public void pauseMusic() {
        pauseButton.setVisible(false);
        playButton.setVisible(true);
        mediaPlayer.pause();
    }

    public void nextSong() {
        if (songNumber < songsPlayList.size() - 1) {
            pauseMusic();
            media = new Media(songsPlayList.get(++songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            songName.setText(songsPlayList.get(songNumber).getName());
            playMusic();
        }
    }

    public void previousSong() {
        if (songNumber > 0) {
            pauseMusic();
            media = new Media(songsPlayList.get(--songNumber).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            songName.setText(songsPlayList.get(songNumber).getName());
            playMusic();
        }
    }
}
