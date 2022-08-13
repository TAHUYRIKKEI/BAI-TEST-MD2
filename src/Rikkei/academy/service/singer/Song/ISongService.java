package Rikkei.academy.service.singer.Song;

import Rikkei.academy.model.Song;
import Rikkei.academy.service.singer.IGeneric;

import java.util.List;

public interface ISongService extends IGeneric<Song> {
     List<Song> findAll();

     void updateId(int id, String name, int age);
}
