package br.com.freshdesk.freshdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.freshdesk.freshdesk.entities.FreshWebHook;

@Repository
public interface FreshWebHookRepository extends JpaRepository<FreshWebHook, Long>{

}
