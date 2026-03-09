package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.app.Entity.Action;

public interface IActionRepository extends JpaRepository<Action, Long> {

}
