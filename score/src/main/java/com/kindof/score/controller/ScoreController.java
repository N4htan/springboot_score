package com.kindof.score.controller;

import com.kindof.score.model.Score;
import com.kindof.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @RequestMapping(value = "/score", method = RequestMethod.GET)
    public ModelAndView getDoc_cli(){
        ModelAndView mv = new ModelAndView("score");
        List<Score> score = scoreService.findAll();
        mv.addObject("score", score);
        return mv;
    }

}
