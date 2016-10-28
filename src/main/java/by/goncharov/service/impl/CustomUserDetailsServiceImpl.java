package by.goncharov.service.impl;

import by.goncharov.dao.UserDAO;
import by.goncharov.entity.RoleEntity;
import by.goncharov.entity.UserEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * AuthorizationServiceImpl.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Service
public class CustomUserDetailsServiceImpl implements UserDetailsService
{
	@Autowired
	private UserDAO userDAO;

	/**
	 * {@inheritDoc}
	 */
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException
	{
		UserEntity userEntity = userDAO.findUserByUsername(username);

		if (userEntity == null)
		{
			throw new UsernameNotFoundException("no such userEntity with username" + username);
		}

		List<GrantedAuthority> authorities = buildUserAuthority(userEntity.getRoleEntity());

		return buildUserForAuthentication(userEntity, authorities);
	}

	/**
	 * Builds User Authority.
	 *
	 * @param roleEntity the roleEntity
	 *
	 * @return the list of GrantedAuthority
	 */
	private List<GrantedAuthority> buildUserAuthority(final RoleEntity roleEntity)
	{

		final Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
		setAuths.add(new SimpleGrantedAuthority(roleEntity.getRoleName()));

		return new ArrayList<GrantedAuthority>(setAuths);
	}

	/**
	 * Builds User For Authentication.
	 *
	 * @param userEntity  the userEntity
	 * @param authorities the authorities
	 *
	 * @return the User
	 */
	private User buildUserForAuthentication(final UserEntity userEntity, final List<GrantedAuthority> authorities)
	{
		return new User(userEntity.getUsername(), userEntity.getPassword(), true, true, true, true, authorities);
	}

}
