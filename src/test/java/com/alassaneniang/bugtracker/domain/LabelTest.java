package com.alassaneniang.bugtracker.domain;

import com.alassaneniang.bugtracker.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LabelTest {

    @Test
    void equalsVerifier () throws Exception {
        TestUtil.equalsVerifier( Label.class );
        Label label1 = new Label();
        label1.setId( 1L );
        Label label2 = new Label();
        label2.setId( label1.getId() );
        assertThat( label1 ).isEqualTo( label2 );
        label2.setId( 2L );
        assertThat( label1 ).isNotEqualTo( label2 );
        label1.setId( null );
        assertThat( label1 ).isNotEqualTo( label2 );
    }
}
