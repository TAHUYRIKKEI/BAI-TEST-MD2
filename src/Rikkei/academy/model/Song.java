package Rikkei.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String name;
    private int id;
    private int listen;
    private int like;

    private List<Singer> singerList;


    public Song() {
    }

    public Song(String name, int id, int like , List<Singer>singerList) {
        this.name = name;
        this.id = id;
        this.like = like;
        this.listen = listen;
        this.singerList = singerList;
    }

    public Song(int i, String dan_truong) {

    }

    public static void aad(Song dan_truong) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getListen() {
        return listen;
    }

    public void setListen(int listen) {
        this.listen = listen;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public List<Singer> getSingerList() {
        return singerList;
    }

    public void setSingerList(List<Singer> singerList) {
        this.singerList = singerList;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", listen=" + listen +
                ", like=" + like +
                ", singerList=" + singerList +
                '}';
    }
}
