package tutorial.android.sgarts.unoscorer.database;

import android.content.Context;

import tutorial.android.sgarts.unoscorer.model.User;

/**
 * Created by ganesh on 9/4/2016.
 */
public class DatabaseManager extends DroidModelManger {

    public DatabaseManager() {
    }

    public static void init(Context context) {
        databaseName = "UnoScorer";
        databaseVersion = 1;
        initAll(context);
        // TODO: Set sync strategy

        // Initialize models to create all required tables
        User u = new User();

    }

    public static void addUser(User user) {
        User u = new User();
        u.userId = user.getUserId();
        u.userName = user.getUserName();
        u.userWinCount = user.getUserWinCount();
        u.userLoseCount = user.getUserLoseCount();
        u.userWinPerCent = user.getUserWinPerCent();


    }
}
