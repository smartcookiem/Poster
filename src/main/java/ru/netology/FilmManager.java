package ru.netology;

public class FilmManager {

    private String[] posters = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {

        this.limit = limit;
    }

    public void addPoster(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];

        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public String[] findAll() {

        return posters;
    }

    public String[] findLast() {
        int resultLength;

        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }

        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = posters[posters.length - 1 - i];
        }
        return reversed;
    }

}
