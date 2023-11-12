package br.com.fabiokusaba.uolhostbackend.model.dto;

import br.com.fabiokusaba.uolhostbackend.model.GroupType;

public record PlayerDto(
        String name,
        String email,
        String phoneNumber,
        GroupType groupType
) {
}
