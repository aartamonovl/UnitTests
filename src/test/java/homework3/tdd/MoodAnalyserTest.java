package homework3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoodAnalyserTest {
    MoodAnalyser moodAnalyser;

    @BeforeEach
    void setUp() {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    void analyseGoodMood() {
        String res = moodAnalyser.analyseMood("Good day");
        assertEquals("GoodMood", res);
    }

    @Test
    void analyseNormalMood() {
        String res = moodAnalyser.analyseMood("Normal day");
        assertEquals("NormalMood", res);
    }

    @Test
    void analyseBadMood() {
        String res = moodAnalyser.analyseMood("Bad day");
        assertEquals("BadMood", res);
    }
}