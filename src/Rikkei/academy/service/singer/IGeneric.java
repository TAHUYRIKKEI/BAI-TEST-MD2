package Rikkei.academy.service.singer;

import java.util.List;

public interface IGeneric<T> {
    List<T> finAll();
    void save(T e);
    void deleteById(int id);
    T findById(int id);
    void sort();
}
