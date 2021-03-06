/*
 * Copyright © 2009-2018 The Apromore Initiative.
 *
 * This file is part of "Apromore".
 *
 * "Apromore" is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of the
 * License, or (at your option) any later version.
 *
 * "Apromore" is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program.
 * If not, see <http://www.gnu.org/licenses/lgpl-3.0.html>.
 */

package org.apromore.mapper;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;

import org.apromore.dao.model.SearchHistory;
import org.apromore.model.SearchHistoriesType;
import org.junit.Before;
import org.junit.Test;

/**
 * SearchHistory Mapper Unit test.
 *
 * @author <a href="mailto:cam.james@gmail.com">Cameron James</a>
 * @since 1.0
 */
public class SearchHistoryMapperUnitTest {

    SearchHistoryMapper mapper;

    @Before
    public void setUp() throws Exception {
        mapper = new SearchHistoryMapper();
    }

    @Test
    public void testConvertFromSearchHistoriesType() throws Exception {
        List<SearchHistoriesType> srhTypes = new ArrayList<SearchHistoriesType>();
        SearchHistoriesType typ1 = new SearchHistoriesType();
        typ1.setNum(1);
        typ1.setSearch("dogs");
        srhTypes.add(typ1);

        SearchHistoriesType typ2 = new SearchHistoriesType();
        typ2.setNum(2);
        typ2.setSearch("cats");
        srhTypes.add(typ2);

        List<SearchHistory> searches = mapper.convertFromSearchHistoriesType(srhTypes);
        assertThat(searches.size(), equalTo(srhTypes.size()));
    }

}
