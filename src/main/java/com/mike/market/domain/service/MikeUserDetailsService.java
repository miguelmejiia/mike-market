package com.mike.market.domain.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MikeUserDetailsService implements UserDetailsService {

    private static List<User> users = new ArrayList<>();

    public MikeUserDetailsService(){
        users.add(new User("miguel", "{noop}mik3", new ArrayList<>()));
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = users.stream().filter(u -> u.getUsername().equals(username)).findAny();
        return new User("miguel", "{noop}mik3", new ArrayList<>());
    }
}
