/*
 * Copyright (C) 2014 lucs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.thomasmore.oo3.course.resortui.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.LoginDto;
import org.thomasmore.oo3.course.resortui.model.SessionDto;

/**
 *
 * @author lucs
 */
@Named(value = "login")
@RequestScoped
public class LoginController {

    private LoginDto dto;

    @Inject
    private SessionDto sessionDto;

    @PostConstruct
    public void init() {
        dto = new LoginDto();
    }

    public String logout(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index.xhtml?faces-redirect=true";
    }
    
    public String login() {
        if (dto.getName().startsWith("a")) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            FacesMessage facesMessage = new FacesMessage("Invalid login - Can't start with [a]");
            facesContext.addMessage(null, facesMessage);
            return null;
        }
        sessionDto.getUserDto().setFname("Jhon");
        sessionDto.getUserDto().setLname("Doe");
        sessionDto.getUserDto().setLoggedIn(true);
        return "index.xhtml";
    }

    public LoginDto getDto() {
        return dto;
    }

    public void setDto(LoginDto dto) {
        this.dto = dto;
    }

}
