package com.aosorio.ecommerce.catalogo.mapper;

import com.aosorio.ecommerce.catalogo.domain.Producto;
import com.aosorio.ecommerce.catalogo.dto.ProductoRequestDTO;
import com.aosorio.ecommerce.catalogo.dto.ProductoResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {
    public Producto toRespondeEntity(ProductoRequestDTO productoRequestDTO) {
        return Producto.builder()
                .nombre(productoRequestDTO.getNombre())
                .descripcion(productoRequestDTO.getDescripcion())
                .precio(productoRequestDTO.getPrecio())
                .stock(productoRequestDTO.getStock())
                .categoria(productoRequestDTO.getCategoria())
                .estado(Producto.EstadoProducto.ACTIVO)
                .build();
}

    public ProductoResponseDTO toResponseDto(Producto producto) {
        return new ProductoResponseDTO(
                producto.getId(),
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getEstado().name(),
                producto.getCategoria(),
                producto.getFechaCreacion()
        );
    }
}
