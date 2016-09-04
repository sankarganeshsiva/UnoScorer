package tutorial.android.sgarts.unoscorer.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.InvocationTargetException;

import tutorial.android.sgarts.unoscorer.R;
import tutorial.android.sgarts.unoscorer.adapter.PlayersAdapter;
import tutorial.android.sgarts.unoscorer.model.User;
import tutorial.android.sgarts.unoscorer.util.DividerItemDecoration;

public class PlayersFragment extends Fragment {
    TextView emptyText;
    RecyclerView mPlayersList;

    public PlayersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_players, container, false);
        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        emptyText = (TextView) view.findViewById(R.id.empty_view);
        mPlayersList = (RecyclerView) view.findViewById(R.id.recycler_view);

        try {
            if (User.findAll(User.class).size() > 0) {
                setAdapter();
            } else {
                showEmptyView();
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (java.lang.InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    private void showEmptyView() {
        emptyText.setVisibility(View.VISIBLE);
    }

    private void setAdapter() throws InvocationTargetException, NoSuchMethodException, java.lang.InstantiationException, IllegalAccessException {
        emptyText.setVisibility(View.GONE);
        PlayersAdapter adapter = new PlayersAdapter(User.findAll(User.class));
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mPlayersList.setLayoutManager(mLayoutManager);
        mPlayersList.setItemAnimator(new DefaultItemAnimator());
        mPlayersList.addItemDecoration(new DividerItemDecoration(getContext()));
        mPlayersList.setAdapter(adapter);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
