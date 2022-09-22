package com.ucacue.springboot.infraestructura.repositorio;

import com.ucacue.springboot.modelo.Bus;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepositorio extends JpaRepository<Bus,Integer> {
}
