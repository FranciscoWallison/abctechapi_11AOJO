package br.com.fiap.abctechapi.controller;

import br.com.fiap.abctechapi.util.VersionComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/")
// @Api(value = "Health Check")
@Api(tags = { "Health Check" })
public class HealthCheckController {

    private final VersionComponent versionComponent;

    public HealthCheckController(@Autowired VersionComponent versionComponent){
        this.versionComponent = versionComponent;
    }

    @ApiOperation(value = "Verificar o status da aplicação")
    @GetMapping
    public ResponseEntity<String> status(){
        return ResponseEntity.ok("UP");
    }

    @ApiOperation(value = "Retornar a versão da aplicação")
    @GetMapping("version")
    public ResponseEntity<String> version(){
        return ResponseEntity.ok(this.versionComponent.getVersion());
    }

}
