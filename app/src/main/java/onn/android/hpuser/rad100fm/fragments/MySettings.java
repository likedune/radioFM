package onn.android.hpuser.rad100fm.fragments;

import onn.android.hpuser.rad100fm.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/************************************************
 * about class refrenced from the drawer not used yet
 ************************************************/

public class MySettings extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.fragment_settings, container, false);

		return v;
	}
}