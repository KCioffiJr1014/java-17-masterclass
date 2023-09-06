package section6.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                return false;
            }
        }
        songs.add(new Song(songTitle, duration));
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber <= 0 || trackNumber > songs.size()) {
            return false;
        }

        Song songToAdd = songs.get(trackNumber-1);
        String songToAddTitle = songToAdd.getTitle();

        for (Song song : playlist) {
            if (song.getTitle().compareTo(songToAddTitle) == 0) {
                return false;
            }
        }
        playlist.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song songToAdd = findSong(songTitle);

        if (songToAdd == null) {
            return false;
        }

        playlist.add(songToAdd);
        for (Song song : playlist) {
            if (song.getTitle().equals(songTitle)) {
                return true;
            }
        }
        playlist.add(songToAdd);
        return false;
    }

    private Song findSong(String title) {
        if (!songs.isEmpty()) {
            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
        }
        return null;
    }
}
