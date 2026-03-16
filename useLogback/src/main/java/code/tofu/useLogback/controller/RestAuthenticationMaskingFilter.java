package code.tofu.useLogback.controller;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


@Component
public class RestAuthenticationMaskingFilter extends  OncePerRequestFilter {

    private static final Logger log = (Logger) LoggerFactory.getLogger("code.tofu.useLogback.controller.RestAuthenticationMaskingFilter");

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        log.info("Filtering request: " + requestURI);
        log.debug(
            """
            Set SecurityContextHolder to Cirrus RestAuthenticationToken[Principal=de.softpro.cirrus.db.utils.CirrusUserDetails] [Username=tenant_admin@test.com, Password=[PROTECTED], Enabled=true, AccountNonExpired=true, CredentialsNonExpired=true, [X-AUTH-TOKEN=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTUxNjIzOTAyMn0.KMUFsIDTnFmyG3nMiGM6H9FNFUROf3wh7SmqJp-QV30], AccountNonLocked=true, Granted Authorities = [ROLE_ADMIN, ROLE TEAMMGR, ROLE_USER]],Credentials=[PROTECTED], Authenticated=true, Details=null, Granted Authorities = [ROLE_USER, ROLE TEAMMGR, ROLE_ADMIN]]
            """); 
        log.debug(
            """
            Signing Session Set SecurityContextHolder to Cirrus RestAuthenticationToken[Principal=de.softpro.cirrus.db.utils.CirrusUserDetails] [Username=tenant_admin@test.com, Password=[PROTECTED], Enabled=true, AccountNonExpired=true, CredentialsNonExpired=true, [X-S-AUTH-TOKEN=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTUxNjIzOTAyMn0.KMUFsIDTnFmyG3nMiGM6H9FNFUROf3wh7SmqJp-QV30], AccountNonLocked=true, Granted Authorities = [ROLE_ADMIN, ROLE TEAMMGR, ROLE_USER]],Credentials=[PROTECTED], Authenticated=true, Details=null, Granted Authorities = [ROLE_USER, ROLE TEAMMGR, ROLE_ADMIN]]
            """); 


        filterChain.doFilter(request, response);
    }
}
    

