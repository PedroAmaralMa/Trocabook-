package com.trocabook.Trocabook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trocabook.Trocabook.model.Usuario;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	Usuario findByEmailAndSenha(String email, String senha);
	Usuario findByEmail(String email);
	List<Usuario> findTop6ByOrderByAvaliacaoDesc();
}
