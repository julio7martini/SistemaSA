package com.example.loginauthapi.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "machine")
@Entity(name = "machine")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_machine")
public class Machine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_machine")
    private Long id_machine;

    private String name;
    private String idTipoMaquina;
    private Date dataInstalacao;
    private String setor;
    private String idUsuario;
    private Date ultimaManutencao;


    public Machine(String name,String idTipoMaquina,Date dataInstalacao, String setor, String idUsuario, Date ultimaManutencao) {
        this.name = name;
        this.idTipoMaquina = idTipoMaquina;
        this.dataInstalacao = dataInstalacao;
        this.setor = setor;
        this.idUsuario = idUsuario;
        this.ultimaManutencao = ultimaManutencao;
    }
}
