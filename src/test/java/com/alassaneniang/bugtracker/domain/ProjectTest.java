package com.alassaneniang.bugtracker.domain;

import com.alassaneniang.bugtracker.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProjectTest {

    @Test
    void equalsVerifier () throws Exception {
        TestUtil.equalsVerifier( Project.class );
        Project project1 = new Project();
        project1.setId( 1L );
        Project project2 = new Project();
        project2.setId( project1.getId() );
        assertThat( project1 ).isEqualTo( project2 );
        project2.setId( 2L );
        assertThat( project1 ).isNotEqualTo( project2 );
        project1.setId( null );
        assertThat( project1 ).isNotEqualTo( project2 );
    }
}
