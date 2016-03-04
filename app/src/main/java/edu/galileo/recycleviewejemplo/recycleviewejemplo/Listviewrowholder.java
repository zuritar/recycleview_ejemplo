package edu.galileo.recycleviewejemplo.recycleviewejemplo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by rzurita on 25/02/2016.
 */
public class Listviewrowholder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView title;
    TextView author;
    TextView edit;
    RelativeLayout relativeLayout;

    public Listviewrowholder(View view) {
        super (view);

        this.author = (TextView) view.findViewById(R.id.author);
        this.title = (TextView) view.findViewById(R.id.title);
        this.edit = (TextView) view.findViewById(R.id.subreddit);
        this.edit = (TextView) view.findViewById(R.id.url);
        this.imageView = (ImageView) view.findViewById(R.id.image);
        this.relativeLayout = (RelativeLayout) view.findViewById(R.id.relayout);
        view.setClickable(true);



    }




}
