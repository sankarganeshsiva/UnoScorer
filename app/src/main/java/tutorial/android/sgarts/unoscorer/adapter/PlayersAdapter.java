package tutorial.android.sgarts.unoscorer.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import tutorial.android.sgarts.unoscorer.R;
import tutorial.android.sgarts.unoscorer.model.User;

/**
 * Created by ganesh on 9/4/2016.
 */
public class PlayersAdapter extends RecyclerView.Adapter<PlayersAdapter.MyViewHolder> {
    ArrayList<Object> userList;

    public PlayersAdapter(ArrayList<Object> users) {
        this.userList = users;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.player_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        User user = null;
        user = (User) userList.get(position);
        holder.title.setText("Name : " + user.getUserName());
        holder.genre.setText("ID : " + user.getUserId());
        holder.winPercent.setRating(Float.valueOf(user.getUserWinCount()));


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, genre;
        RatingBar winPercent;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            winPercent = (RatingBar) view.findViewById(R.id.win_percent);
        }
    }
}
