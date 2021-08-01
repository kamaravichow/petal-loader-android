package me.aravi.loader;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;

public abstract class LoaderBase extends Dialog {

    protected LoaderBase(Context context) {
        super(context, R.style.Loader);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }

    protected LoaderBase(Context context, int theme) {
        super(context, theme);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
    }

    protected int getMinimumSideOfScreen(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics metrics = windowManager.getCurrentWindowMetrics();
            metrics.getBounds();
            return Math.min(metrics.getBounds().height(), metrics.getBounds().width());
        }
        Point size = new Point();
        display.getSize(size);
        return Math.min(size.x, size.y);
    }

}
