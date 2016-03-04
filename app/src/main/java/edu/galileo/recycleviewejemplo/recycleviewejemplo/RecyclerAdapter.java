package edu.galileo.recycleviewejemplo.recycleviewejemplo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rzurita on 26/02/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<Listviewrowholder>{

    private List<ListItems> listItemsList;
    private Context mContext;
    private ImageLoader mImageLoader;
    private int focusedItem = 0;

    public RecyclerAdapter(Context context, List<ListItems> listItemsList){
        this.listItemsList = listItemsList;
        this.mContext = context;
    }

  @Override
    public Listviewrowholder onCreateViewHolder(final ViewGroup viewGroup, int position){
      View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, null);
      Listviewrowholder holder = new Listviewrowholder(v);

      holder.relativeLayout.setClickable(new View.OnClickListener(){

          @Override
          public void onClick(View v) {
              TextView reeditURL = (TextView) v.findViewById(R.id.url);
              String postURL = redditURL.getText().toString();
              Intent intent = new Intent(mContext,WebActivity.class);
              intent.putExtra("url",postURL);
              mContext.startActivity(intent);

          }
      });
        return holder;

  }
}
