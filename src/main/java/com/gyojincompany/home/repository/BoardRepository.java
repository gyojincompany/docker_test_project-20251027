package com.gyojincompany.home.repository;

import com.gyojincompany.home.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
