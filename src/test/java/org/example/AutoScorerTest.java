package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AutoScorerTest {

    @Test
    void shouldShowTenPinsAtTheBeginningOfTheFrame() {
        Frame frame = new Frame();

        assertThat(frame.getPins().size()).isEqualTo(10);
    }

    @Test
    void shouldCreateNewFrameAfterTwoThrows() {
        Game game = new Game();

        var old = game.getCurrentFrame();

        game.registerThrow();
        game.registerThrow();

        assertThat(game.getCurrentFrame()).isNotEqualTo(old);
    }
}
