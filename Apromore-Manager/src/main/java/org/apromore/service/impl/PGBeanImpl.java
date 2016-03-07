/*
 * Copyright © 2009-2016 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */

package org.apromore.service.impl;

import org.apromore.service.PGBean;

/**
 * Created by corno on 23/08/2014.
 */
public class PGBeanImpl implements PGBean{
    private String host;
    private String name;
    private String user;
    private String password;

//    public PGBeanImpl(){}

    public PGBeanImpl(String host,String name,String user,String password){
        this.host=host;
        this.name=name;
        this.user=user;
        this.password=password;
    }
    @Override
    public String getHost() {
        return host;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }
}
