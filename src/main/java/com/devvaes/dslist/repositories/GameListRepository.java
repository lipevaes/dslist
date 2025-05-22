package com.devvaes.dslist.repositories;

import com.devvaes.dslist.entities.Game;
import com.devvaes.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
