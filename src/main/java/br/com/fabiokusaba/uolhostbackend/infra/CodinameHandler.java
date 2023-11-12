package br.com.fabiokusaba.uolhostbackend.infra;

import br.com.fabiokusaba.uolhostbackend.model.GroupType;
import br.com.fabiokusaba.uolhostbackend.service.CodinameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Camada de Infra para trabalharmos com arquivos externos
@Component
public class CodinameHandler {

    @Autowired
    private CodinameService service;

    public String findCodiname(GroupType groupType) {
        if (groupType == GroupType.AVENGERS) {
            String firstMatch = service.getAvengersCodinameList().stream().findFirst().orElseThrow();
            this.service.getAvengersCodinameList().remove(firstMatch);
            return firstMatch;
        } else {
            String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
            this.service.getJusticeLeagueList().remove(firstMatch);
            return firstMatch;
        }
    }
}
