package br.com.fatecararars.pdev.api.v1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.fatecararars.pdev.repositories.UsuarioRepository;

@Service
public class UserDetailDetailServiceImpl implements UserDetailsService {

    @Autowired
    BCryptPasswordEncoder encoder;

    @Autowired
    UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //TODO: Finalizar a classe Usuario para utilizar o metodo findByLogin()
        //Usuario usuario = repository.findByLogin(username);


        //TODO: Remover autenticação de testes e utilizar autenticação via banco de dados.
        if (username.equals("admin")) {
            return User.withUsername("admin")
                    .password(encoder.encode("123456"))
                    .roles("ADMIN")
                    .build();
        }

        // TODO: Criar exceção customizada.
        throw new RuntimeException("Usuário não encontrado");
    }

}
