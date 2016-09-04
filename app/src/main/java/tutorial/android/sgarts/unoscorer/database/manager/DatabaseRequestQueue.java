package tutorial.android.sgarts.unoscorer.database.manager;

import java.util.concurrent.PriorityBlockingQueue;

public class DatabaseRequestQueue {

    private static final int DEFAULT_DB_THREAD_POOL_SIZE = 4;
    private static DatabaseRequestQueue _instance;
    private final PriorityBlockingQueue<DatabaseRequest> databaseQueue =
            new PriorityBlockingQueue<DatabaseRequest>();
    private DatabaseDispatcher[] dDispatchers;

    private DatabaseHandler db;

    private DatabaseDelivery mDelivery;

    private DatabaseRequestQueue(int threadPoolSize, DatabaseHandler db) {
        dDispatchers = new DatabaseDispatcher[threadPoolSize];
        this.db = db;
        //this.mDelivery = delivery;
    }

    public DatabaseRequestQueue() {
        dDispatchers = new DatabaseDispatcher[DEFAULT_DB_THREAD_POOL_SIZE];
    }

    public static DatabaseRequestQueue getInstance() {
        if (_instance == null) {
            _instance = new DatabaseRequestQueue(DEFAULT_DB_THREAD_POOL_SIZE, DatabaseHandler.getInstance());
        }
        return _instance;
    }

    public void start() {
        stop();  // Make sure any currently running dispatchers are stopped.

        // Create database dispatchers (and corresponding threads) up to the pool size.
        for (int i = 0; i < dDispatchers.length; i++) {
            DatabaseDispatcher databaseDispatcher = new DatabaseDispatcher(databaseQueue, db, mDelivery);
            dDispatchers[i] = databaseDispatcher;
            databaseDispatcher.start();
        }
    }

    public void stop() {
        for (int i = 0; i < dDispatchers.length; i++) {
            if (dDispatchers[i] != null) {
                dDispatchers[i].quit();
            }
        }
    }

    public DatabaseRequest addRequest(DatabaseRequest request) {

        databaseQueue.add(request);

        return request;

    }

}
