package com.aosorio.ecommerce.catalogo.service;

import com.aosorio.ecommerce.catalogo.dto.ProductoRequestDTO;
import com.aosorio.ecommerce.catalogo.dto.ProductoResponseDTO;

import java.util.List;

public interface ProductoService {
    ProductoResponseDTO crear(ProductoRequestDTO productoRequestDTO);
    ProductoResponseDTO actualizar(ProductoRequestDTO productoRequestDTO);
    void eliminar(ProductoRequestDTO productoRequestDTO);
    ProductoResponseDTO obtenerPorId(Long id);
    List<ProductoResponseDTO> obtenerTodos();
}
