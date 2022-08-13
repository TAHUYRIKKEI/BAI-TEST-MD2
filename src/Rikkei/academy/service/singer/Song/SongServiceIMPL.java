package Rikkei.academy.service.singer.Song;

import Rikkei.academy.model.Singer;
import Rikkei.academy.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongServiceIMPL implements ISongService{
    private static final List<Song> song = new ArrayList<>();

    static {
        Song.aad(new Song(1, "DAN TRUONG"));
        Song.aad(new Song(2, "LAM TRUONG"));
        Song.aad(new Song(3, "DUY NGUYEN"));
        Song.aad(new Song(4, "DAN HUY"));
        Song.aad(new Song(5, " TRUONG VU"));
        for (Song song1 :song){
            song1.setListen((int) (Math.random()*100 + 1));
            song1.setLike((int) (Math.random()* song1.getListen() +1));
        }
    }




    @Override
    public void save(Song e) {

    }

    @Override
    public void save(Singer singer) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Song findById(int id) {
        return null;
    }

    @Override
    public void sort() {

    }

    @Override
    public List<Song> findAll() {
        return null;
    }
    @Override
    public void updateId(int id, String name, int age) {

    }
}
