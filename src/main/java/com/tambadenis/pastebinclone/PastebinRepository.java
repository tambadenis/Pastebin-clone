package com.tambadenis.pastebinclone;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PastebinRepository extends JpaRepository<Pastebin, Long> {

}
