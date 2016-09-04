package tutorial.android.sgarts.unoscorer.database.manager;


import tutorial.android.sgarts.unoscorer.database.DroidModelException;

public interface DatabaseDelivery {
    /**
     * Parses a response from the network or cache and delivers it.
     */
    public void postResponse(DatabaseRequest request, DatabaseResponse response);

    /**
     * Parses a response from the network or cache and delivers it. The provided
     * Runnable will be executed after delivery.
     */
    public void postResponse(DatabaseRequest request, DatabaseResponse response, Runnable runnable);

    /**
     * Posts an error for the given request.
     */
    public void postError(DatabaseRequest request, DroidModelException error);
}
