package com.devvaes.dslist.services;

import com.devvaes.dslist.dto.GameDTO;
import com.devvaes.dslist.dto.GameListDTO;
import com.devvaes.dslist.dto.GameMinDTO;
import com.devvaes.dslist.entities.Game;
import com.devvaes.dslist.entities.GameList;
import com.devvaes.dslist.repositories.GameListRepository;
import com.devvaes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }

}
