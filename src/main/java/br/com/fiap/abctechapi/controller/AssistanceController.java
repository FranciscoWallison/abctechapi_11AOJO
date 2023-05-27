package br.com.fiap.abctechapi.controller;

import br.com.fiap.abctechapi.application.AssistanceApplication;
import br.com.fiap.abctechapi.application.dto.AssistResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assists")
@Api(value = "Assistance", tags = { "Assistance" })
public class AssistanceController {

    private final AssistanceApplication assistanceApplication;

    @Autowired
    public AssistanceController(AssistanceApplication assistanceApplication){
        this.assistanceApplication = assistanceApplication;
    }

    @ApiOperation(value = "Get a list of all assists", tags = { "Assistance" })
    @GetMapping
    public ResponseEntity<List<AssistResponseDto>> getAssists(){
        return ResponseEntity.ok(assistanceApplication.getAssists());
    }

}
