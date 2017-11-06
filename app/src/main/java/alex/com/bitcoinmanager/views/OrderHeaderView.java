package alex.com.bitcoinmanager.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import alex.com.bitcoinmanager.R;

/**
 * Created by Alex on 11/3/2017.
 */

public class OrderHeaderView extends LinearLayout {

    public OrderHeaderView(Context context) {
        super(context);
        init(context);
    }

    public OrderHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public OrderHeaderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_order_header, this, true);
    }
}
