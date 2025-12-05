/*
 * The MIT License
 *
 *  Copyright (c) 2020, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package org.jeasy.states.api;

import org.assertj.core.api.Assertions;
import org.jeasy.states.samples.MealyState;
import org.jeasy.states.samples.MooreState;
import org.junit.Test;

public class StateTest {

    @Test
    public void whenTwoStatesHaveTheSameName_thenTheyShouldBeEqual() {
        // Given
        State s1 = new MealyState("s1");
        State s2 = new MealyState("s1");

        // When
        boolean equals = s1.equals(s2);

        // Then
        Assertions.assertThat(equals).isTrue();
    }

    @Test
    public void whenTwoStatesHaveDifferentNames_thenTheyShouldNotBeEqual() {
        // Given
        State s1 = new MealyState("s1");
        State s2 = new MealyState("s2");

        // When
        boolean equals = s1.equals(s2);

        // Then
        Assertions.assertThat(equals).isFalse();
    }
    
    @Test
    public void whenTwoMooreStatesHaveSameNameAndOutput_thenTheyShouldBeEqual() {
        // Given
        MooreState s1 = new MooreState("s1", "output1");
        MooreState s2 = new MooreState("s1", "output1");

        // When
        boolean equals = s1.equals(s2);

        // Then
        Assertions.assertThat(equals).isTrue();
        Assertions.assertThat(s1.hashCode()).isEqualTo(s2.hashCode());
    }

    @Test
    public void whenTwoMooreStatesHaveDifferentNames_thenTheyShouldNotBeEqual() {
        // Given
        MooreState s1 = new MooreState("s1", "output1");
        MooreState s2 = new MooreState("s2", "output1");

        // When
        boolean equals = s1.equals(s2);

        // Then
        Assertions.assertThat(equals).isFalse();
    }

    @Test
    public void whenTwoMooreStatesHaveSameNameButDifferentOutputs_thenTheyShouldNotBeEqual() {
        // Given
        MooreState s1 = new MooreState("s1", "output1");
        MooreState s2 = new MooreState("s1", "output2");

        // When
        boolean equals = s1.equals(s2);

        // Then
        Assertions.assertThat(equals).isFalse();
    }

    @Test
    public void toStringShouldIncludeNameAndOutput() {
        // Given
        MooreState s1 = new MooreState("s1", "output1");

        // When
        String result = s1.toString();

        // Then
        Assertions.assertThat(result)
                  .contains("s1")
                  .contains("output1");
    }
}
