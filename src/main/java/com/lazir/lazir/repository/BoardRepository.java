package com.lazir.lazir.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lazir.lazir.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{
    
	Page<Board> findByTitleContainingOrContentContaining(String title,String content,Pageable pageable);
	
	Page<Board> findByTitleContaining(String title,Pageable pageable);
	
	Page<Board> findByContentContaining(String title,Pageable pageable);
}
