package com.kindof.score.service.serviceImpl;

import com.kindof.score.model.Score;
import com.kindof.score.repository.ScoreRepository;
import com.kindof.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl implements ScoreService {


    @Autowired
    ScoreRepository scoreRepository;

    @Override
    public List<Score> findAll() {
        return scoreRepository.findAll();
    }

    @Override
    public Score findById(long id) {
        return scoreRepository.findById(id).get();
    }

    @Override
    public Score save(Score score) {
        return scoreRepository.save(score);
    }
}