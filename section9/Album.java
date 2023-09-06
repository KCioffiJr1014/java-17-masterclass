package section9;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String songTitle, double duration) {
        Song song = songs.findSong(songTitle);

        if (song == null) {
            songs.add(new Song(songTitle, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song songToAdd = songs.findSong(trackNumber);

        if (songToAdd == null) {
            return false;
        }
        playlist.add(songToAdd);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song songToAdd = songs.findSong(songTitle);
        if (songToAdd == null) {
            return false;
        }

        playlist.add(songToAdd);
        return true;
    }

    public static class SongList {

        public ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }

        private boolean add(Song songToAdd) {

            if (songs.contains(songToAdd)) {
                return false;
            }

            songs.add(songToAdd);
            return true;
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

        public Song findSong(int trackNumber) {
            if (songs.size() == 0 || trackNumber < 0) {
                return null;
            }
            return songs.get(trackNumber);
        }
    }
}
