package com.devyyj.pigdiary.freeboard.repository;

import com.devyyj.pigdiary.freeboard.entity.FreeBoard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FreeBoardRepository extends JpaRepository<FreeBoard, Long> {
    @Query("SELECT f, u.nickName FROM FreeBoard f JOIN MyUser u ON f.userId = u.id")
    Page<Object[]> findFreeBoardsWithNickName(Pageable pageable);
}
