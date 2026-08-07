package com.aosorio.ecommerce.catalogo.controller;
import com.aosorio.ecommerce.catalogo.domain.Producto;
import com.aosorio.ecommerce.catalogo.dto.ProductoRequestDTO;
import com.aosorio.ecommerce.catalogo.dto.ProductoResponseDTO;
import com.aosorio.ecommerce.catalogo.service.ProductoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/producto")
public class ProductoController {
    private final ProductoService productoService;

    @PostMapping
    public ResponseEntity<ProductoResponseDTO> save(
           @Valid @RequestBody ProductoRequestDTO productoRequestDTO) {

        ProductoResponseDTO creado = productoService.crear(productoRequestDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(creado);
    }
}
