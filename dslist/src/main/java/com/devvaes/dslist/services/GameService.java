package com.devvaes.dslist.services;
import java.util.List;
import com.devvaes.dslist.dto.GameMinDTO;
import com.devvaes.dslist.entities.Game;
import com.devvaes.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
