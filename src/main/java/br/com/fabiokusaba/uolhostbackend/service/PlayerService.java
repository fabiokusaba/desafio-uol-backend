package br.com.fabiokusaba.uolhostbackend.service;

import br.com.fabiokusaba.uolhostbackend.infra.CodinameHandler;
import br.com.fabiokusaba.uolhostbackend.model.GroupType;
import br.com.fabiokusaba.uolhostbackend.model.Player;
import br.com.fabiokusaba.uolhostbackend.model.dto.PlayerDto;
import br.com.fabiokusaba.uolhostbackend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private String getCodiname(GroupType groupType) {
        return handler.findCodiname(groupType);
    }

    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
}
