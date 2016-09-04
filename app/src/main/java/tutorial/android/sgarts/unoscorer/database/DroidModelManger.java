package tutorial.android.sgarts.unoscorer.database;

import android.content.Context;

import tutorial.android.sgarts.unoscorer.database.manager.DatabaseHandler;
import tutorial.android.sgarts.unoscorer.database.manager.DatabaseRequestQueue;


public class DroidModelManger {

    protected static String databaseName;
    protected static Integer databaseVersion;

    public static void initAll(Context context) {
        DatabaseHandler db = DatabaseHandler.getInstance(context, databaseName, databaseVersion);
        DatabaseRequestQueue dbQueue = DatabaseRequestQueue.getInstance();
        dbQueue.start();
    }
}
