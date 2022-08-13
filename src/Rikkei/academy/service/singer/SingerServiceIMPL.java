package Rikkei.academy.service.singer;

import Rikkei.academy.model.Singer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingerServiceIMPL implements ISingerService {
    private static final List<Singer> singerList = new ArrayList<>();

    static {
        singerList.add(new Singer(1, "TU", 22));
        singerList.add(new Singer(2, "HAI", 32));
        singerList.add(new Singer(3, "NAM", 24));
        singerList.add(new Singer(4, "DUNG", 20));
    }

    @Override
    public List<Singer> findAll() {
        return singerList;
    }

    @Override
    public void save(Singer singer) { singerList.add(singer);

    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < singerList.size(); i++) {
            if (id == singerList.get(i).getId()){
                singerList.remove(i);
            }

        }


    }

    @Override
    public Singer findById(int id) {
        return singerList.get(id -1);
    }

    @Override
    public void sort() {
        Collections.sort(singerList);
        updateId();

    }

    @Override
    public void save() {

    }

    private void updateId() {
        for (int i = 0; i < singerList.size(); i++) {
            singerList.get(i).setId(i + 1);

        }
    }
}
