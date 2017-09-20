package com.example.liongate.criminalintent;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by Liongate on 20.09.2017.
 */

public class ImageViewFragment extends DialogFragment {

    private ImageView mImageView;
    private  static final String ARG_FILE = "file";

    public static ImageViewFragment newInstance(File file){
        Bundle args = new Bundle();
        args.putSerializable(ARG_FILE,file);

        ImageViewFragment fragment = new ImageViewFragment();
        fragment.setArguments(args);
        return  fragment;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        File file = (File) getArguments().getSerializable(ARG_FILE);

        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_image_view,null);

        mImageView = v.findViewById(R.id.crime_photo);

        Bitmap bitmap = PictureUtils.getScaledBitmap(file.getPath(),getActivity());

        mImageView.setImageBitmap(bitmap);

        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .create();
    }

}
