package app.webelement.com.test.fragment;

/**
 * Created by ADMIN on 11/8/16.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import app.webelement.com.test.R;
import app.webelement.com.test.activities.MainActivity;


public class OneFragment extends Fragment{

    private MainActivity context;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        getActivity().setResult(android.app.Activity.RESULT_OK);

        context = (MainActivity) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

}
