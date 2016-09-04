package tutorial.android.sgarts.unoscorer.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Bijoy on 3/6/2015.
 * This file is the core function file of the entire application
 * All the functions here are static functions and form the basis of the app
 */
public class Utils {

    /**
     * Makes a toast(this is much cleaner than the code for toast)
     *
     * @param context the activity context
     * @param text    the text to be printed
     */
    public static void makeToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }


}
