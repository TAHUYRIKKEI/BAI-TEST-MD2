package Rikkei.academy.controller;

import Rikkei.academy.model.Singer;
import Rikkei.academy.service.singer.ISingerService;
import Rikkei.academy.service.singer.SingerServiceIMPL;

import java.util.List;

public class SingerController {
    private final ISingerService singerService = (ISingerService) new SingerServiceIMPL();

    public List<Singer> getSingers() {
        return singerService.findAll();
    }

    public void addSinger(Singer singer) {
        singerService.save();
    }

    public void deleteSinger(int id) {
        singerService.deleteById(id);
    }

    public Singer findSingerById(int id) {
        return singerService.findById(id);
    }

    public void sortSingerList() {
        singerService.sort();
    }

}