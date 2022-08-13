package Rikkei.academy.service.singer;

import Rikkei.academy.model.Singer;

import java.util.List;

public interface ISingerService extends IGeneric<Singer> {
//    List<Singer> findAll();
//
//    void save(Singer singer);
//
//    void deleteById(int id);
//
//    Singer findById(int id);

    void sort();

    void save();
}
