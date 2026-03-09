package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.app.Entity.Module;

public interface IModuleRepository extends JpaRepository<Module, Long> {

}