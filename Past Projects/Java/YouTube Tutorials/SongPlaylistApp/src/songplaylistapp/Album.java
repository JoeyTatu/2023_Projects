package songplaylistapp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Album() {
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            System.out.println("\"" + title + "\" successfully added.");
            return true;
        } else {
            System.out.println("\"" + title + "\" already exists.");
            return false;
        }
    }

    private Song findSong(String title) {
        for (Song checkSong : songs) {
            if (checkSong.getTitle().equals(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList) {
        int index = trackNumber - 1;
        if (index > 0 && index <= this.songs.size()) {
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have this track number " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList) {
        for (Song checkSong : this.songs) {
            if (checkSong.getTitle().equals(title)) {
                PlayList.add(checkSong);
                return true;
            }
        }
        System.out.println("\"" + title + "\" does not exist in album.");
        return false;
    }
}
