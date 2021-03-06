package org.geotools.data.postgis;

import org.geotools.jdbc.JDBCDateTest;
import org.geotools.jdbc.JDBCDateTestSetup;

/**
 * 
 *
 * @source $URL$
 */
public class PostgisDateTest extends JDBCDateTest {
   
    public PostgisDateTest() {
        testNegativeDates = true;
    }

    @Override
    protected JDBCDateTestSetup createTestSetup() {        
        return new PostgisDateTestSetup(new PostGISTestSetup());
    }
    
}
