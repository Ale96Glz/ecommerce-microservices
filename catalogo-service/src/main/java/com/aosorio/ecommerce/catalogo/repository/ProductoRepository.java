package com.aosorio.ecommerce.catalogo.repository;

import com.aosorio.ecommerce.catalogo.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContainingIgnoreCase(String nombre);

    Optional<Producto> findByNombreAndEstado(String nombre, Producto.EstadoProducto estado);

    boolean existsByNombre(String nombre);
}
