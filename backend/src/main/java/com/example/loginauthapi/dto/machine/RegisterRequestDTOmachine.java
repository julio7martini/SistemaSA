package com.example.loginauthapi.dto.machine;


import java.util.Date;

public record RegisterRequestDTOmachine (String name, String idTipoMaquina, Date dataInstalacao, String setor, String idUsuario, Date ultimaManutencao){

}
