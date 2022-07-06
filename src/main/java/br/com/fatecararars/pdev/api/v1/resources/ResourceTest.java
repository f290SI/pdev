package br.com.fatecararars.pdev.api.v1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class ResourceTest {
    
    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("End-point de testes de segurança.");
    }
}
