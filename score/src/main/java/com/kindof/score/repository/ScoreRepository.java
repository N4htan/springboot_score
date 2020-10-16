package com.kindof.score.repository;

import com.kindof.score.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository <Score, Long> {
}
