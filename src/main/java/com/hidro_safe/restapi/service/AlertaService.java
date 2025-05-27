// src/main/java/com/hidro_safe/restapi/service/AlertaService.java
package com.hidro_safe.restapi.service;

import com.hidro_safe.restapi.dto.AlertaDTO;
import java.util.List;

public interface AlertaService {
    List<AlertaDTO> obterAlertasAtivos();
    AlertaDTO salvarAlerta(AlertaDTO alertaDTO);
}