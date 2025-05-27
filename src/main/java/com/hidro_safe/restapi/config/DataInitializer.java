package com.hidro_safe.restapi.config;

import com.hidro_safe.restapi.model.ConfiguracaoSistema;
import com.hidro_safe.restapi.repository.ConfiguracaoSistemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ConfiguracaoSistemaRepository configuracaoSistemaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Configuração do sistema
        ConfiguracaoSistema config = new ConfiguracaoSistema();
        config.setBombasDrenagem(false);
        config.setComportasAbertas(false);
        config.setAlertasAtivos(true);
        configuracaoSistemaRepository.save(config);
    }
}