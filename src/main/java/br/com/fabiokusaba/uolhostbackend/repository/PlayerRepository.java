package br.com.fabiokusaba.uolhostbackend.repository;

import br.com.fabiokusaba.uolhostbackend.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
