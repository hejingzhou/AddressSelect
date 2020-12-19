package top.cyixlq.widget.common;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public <T extends View> T getView(@IdRes final int id) {
        return itemView.findViewById(id);
    }

    public BaseViewHolder setText(@IdRes final int id, final String text) {
        this.<TextView>getView(id).setText(text);
        return this;
    }

    public BaseViewHolder setTextColor(@IdRes final int id, @ColorInt final int color) {
        this.<TextView>getView(id).setTextColor(color);
        return this;
    }

    public BaseViewHolder setImageResource(@IdRes final int id, @DrawableRes final int res) {
        this.<ImageView>getView(id).setImageResource(res);
        return this;
    }

    public BaseViewHolder setVisibility(@IdRes final int id, final int visibility) {
        this.<View>getView(id).setVisibility(visibility);
        return this;
    }
}
