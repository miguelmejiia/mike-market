package com.mike.market.web.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;

public class JWTUtil {

    private static final String KEY = "mik3";

    public String generateToken(UserDetails userDetails) {
        return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() +1000 * 60 * 60 * 10)) // Establece fecha de expiracion de 10 hrs
                .signWith(SignatureAlgorithm.HS256, KEY).compact(); // Firmar método
    }
}
