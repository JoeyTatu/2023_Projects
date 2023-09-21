package songplaylistapp;

import java.util.*;

public class Main {
    private static final ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album;

        album = new Album("Highway to Hell (album)", "AC/DC");
        album.addSong("TNT", 4.5);
        album.addSong("Highway to Hell", 3.5);
        album.addSong("ThunderStruck", 5.0);
        albums.add(album);

        album = new Album("8 Mile", "Eminem");
        album.addSong("Rap God", 4.1);
        album.addSong("Not Afraid", 1.6);
        album.addSong("Lose Yourself", 3.3);
        albums.add(album);

        LinkedList<Song> playList1 = new LinkedList<>();
        albums.get(0).addToPlayList("TNT", playList1);
        albums.get(0).addToPlayList("Highway to Hell", playList1);
        albums.get(1).addToPlayList("Rap God", playList1);
        albums.get(1).addToPlayList("Lose Yourself", playList1);

        System.out.println();
        play(playList1);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("This playlist is empty");
        } else {
            System.out.println("Now playing: " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = s.nextInt();
            s.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    } else {
                        System.out.println("No song available. Reached end of playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    } else {
                        System.out.println("At first song. Cannot play previous.");
                        forward = false;
                    }
                    break;

                case 3:
                    if (!forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing: " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("At first song. Cannot play previous");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing: " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("No song available. Reached end of playlist");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();

                        if (listIterator.hasNext()) {
                            System.out.println("Now playing: " + listIterator.next().toString());
                        } else {
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now playing: " + listIterator.previous().toString());
                            }
                        }

                    }
            }
        }
    }

    private static void printMenu() {
        System.out.println("""
                Available options:
                0 - ⏏ QUIT
                1 - ⏭ Next song
                2 - ⏮ Previous song
                3 - 🔂 Replay song
                4 - ℹ List all songs
                5 - ℹ All options
                6 - ⏏ Delete current song
                """
        );
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("------------------------");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------");
    }
}
