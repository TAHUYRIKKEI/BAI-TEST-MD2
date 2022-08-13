package Rikkei.academy.service.singer;

import Rikkei.academy.model.Singer;

import java.util.List;

public interface IGeneric<T> {
    List<T> findAll();
    void save(T e);

    void save(Singer singer);

    void deleteById(int id);
    T findById(int id);

    void sort();
//    void sort();
}
