package com.xtremelabs.droidsugar.view;

import android.graphics.Bitmap;
import android.widget.ImageView;

@SuppressWarnings({"ALL"})
public class FakeImageView extends FakeView {
    private Bitmap imageBitmap;

    public FakeImageView(ImageView view) {
        super(view);
    }

    public void setImageBitmap(Bitmap imageBitmap) {
        this.imageBitmap = imageBitmap;
    }

    public Bitmap getImageBitmap() {
        return imageBitmap;
    }
}