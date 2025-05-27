// src/main/java/com/hidro_safe/restapi/config/DataInitializer.java
package com.hidro_safe.restapi.config;

import com.hidro_safe.restapi.model.Alerta;
import com.hidro_safe.restapi.model.DadosMonitoramento;
import com.hidro_safe.restapi.model.Evento;
import com.hidro_safe.restapi.repository.AlertaRepository;
import com.hidro_safe.restapi.repository.DadosMonitoramentoRepository;
import com.hidro_safe.restapi.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.UUID;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private DadosMonitoramentoRepository dadosRepository;

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private AlertaRepository alertaRepository;

    @Override
    public void run(String... args) {
        // Dados de monitoramento
        DadosMonitoramento dados = new DadosMonitoramento();
        dados.setNivelRio(3.5);
        dados.setPrecipitacao(10.2);
        dados.setTemperatura(25.7);
        dados.setRisco("medio");
        dados.setTimestamp(Instant.now());
        dados.setLocalizacao("Região Central");
        dadosRepository.save(dados);

        // Eventos
        Evento evento = new Evento();
        evento.setTipo("ALERTA");
        evento.setDescricao("Nível do rio aumentou rapidamente");
        evento.setTimestamp(Instant.now().minusSeconds(3600));
        evento.setValor("3.2m");
        eventoRepository.save(evento);

        // Alertas
        Alerta alerta = new Alerta();
        alerta.setTipo("aviso");
        alerta.setTitulo("Chuva acima da média");
        alerta.setDescricao("Precipitação acima de 10mm/h nas últimas 2 horas");
        alerta.setTimestamp(Instant.now().minusSeconds(1800));
        alerta.setResolvido(false);
        alertaRepository.save(alerta);
    }
}