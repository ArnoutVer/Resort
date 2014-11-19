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

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.thomasmore.oo3.course.resortui.model.IndexPageDto;

/**
 *
 * @author lucs
 */
@Named(value = "index")
@RequestScoped
public class IndexController
{

    private IndexPageDto dto;
    
    

    @PostConstruct
    public void init()
    {
        Date date = new Date();
        System.out.println("IndexController - init");
    }

    public IndexPageDto getDto()
    {
        return dto;
    }

    public void setDto(IndexPageDto dto)
    {
        this.dto = dto;
    }

}
