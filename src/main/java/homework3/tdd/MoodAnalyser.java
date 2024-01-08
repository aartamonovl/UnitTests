package homework3.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.toLowerCase().contains("good"))
            return "GoodMood";
        if (message.toLowerCase().contains("normal"))
            return "NormalMood";
        if (message.toLowerCase().contains("bad"))
            return "BadMood";
        return "UnknownMood";
    }

}