package tutorial.android.sgarts.unoscorer.model;

import java.util.Map;

/**
 * Created by ganesh on 9/4/2016.
 */
public class Game {
    public static String GameId;
    public static String GameStartedDateTime;
    public static Map<String, String> GamePlayersandScore;
    public static String gameStatus;

    public static Map<String, String> getGamePlayersandScore() {
        return GamePlayersandScore;
    }

    public static void setGamePlayersandScore(Map<String, String> gamePlayersandScore) {
        GamePlayersandScore = gamePlayersandScore;
    }

    public static String getGameId() {
        return GameId;
    }

    public static void setGameId(String gameId) {
        GameId = gameId;
    }

    public static String getGameStartedDateTime() {
        return GameStartedDateTime;
    }

    public static void setGameStartedDateTime(String gameStartedDateTime) {
        GameStartedDateTime = gameStartedDateTime;
    }

    public static String getGameStatus() {
        return gameStatus;
    }

    public static void setGameStatus(String gameStatus) {
        Game.gameStatus = gameStatus;
    }
}
