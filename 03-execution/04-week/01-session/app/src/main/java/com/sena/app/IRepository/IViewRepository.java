package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.app.Entity.View;

public interface IViewRepository extends JpaRepository<View, Long> {

}