package com.devvaes.dslist.controllers;
import java.util.List;

import com.devvaes.dslist.dto.GameDTO;
import com.devvaes.dslist.dto.GameMinDTO;
import com.devvaes.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{listid}")
    public List<GameMinDTO> findById(@PathVariable Long listid) {
        List<GameMinDTO> result = (List<GameMinDTO>) gameService.findById(listid);
        return result;
    }
}
