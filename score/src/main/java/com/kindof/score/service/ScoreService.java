package com.kindof.score.service;

import com.kindof.score.model.Score;

import java.util.List;

public interface ScoreService {

    List<Score> findAll();
    Score findById(long id);
    Score save(Score score);
}
