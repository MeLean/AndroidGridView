package telerikandroid.milen.com.gridviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PictureStringGridAdapter extends BaseAdapter {

    //class needed to implement view-holder pattern
    static class ViewHolderItem {
        ImageView iwImage;
        TextView twImageText;
    }

    private Context mContext;
    private GridItem[] gridItems;

    public PictureStringGridAdapter(Context context, GridItem[] gridItems) {
        this.setmContext(context);
        this.setGridItems(gridItems);
    }

    private Context getmContext() {
        return mContext;
    }

    private void setmContext(Context mContext) {
        this.mContext = mContext;
    }

    public GridItem[] getGridItems() {
        return gridItems;
    }

    public void setGridItems(GridItem[] gridItems) {
        this.gridItems = gridItems;
    }


    @Override
    public int getCount() {
        return gridItems.length;
    }

    @Override
    public GridItem getItem(int position) {
        return gridItems[position];
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = null;
        ViewHolderItem viewHolder;

        if(gridView == null) {

            LayoutInflater gridViewInflater = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
            gridView = gridViewInflater.inflate(R.layout.picture_string_layout, null);

            viewHolder = new ViewHolderItem();

            viewHolder.iwImage = (ImageView) gridView.findViewById(R.id.iwImage);
            viewHolder.twImageText = (TextView) gridView.findViewById(R.id.twImageText);

            gridView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolderItem) gridView.getTag();
        }

        String currentText = this.getTextAtPosition(position);
        viewHolder.twImageText.setText(currentText);
        viewHolder.iwImage.setImageResource(getPictureIdAtPosition(position));

        return gridView;
    }

    public String getTextAtPosition(int position){
        return String.valueOf(gridItems[position].getGridItemText());
    }

    public int getPictureIdAtPosition(int position){
        return gridItems[position].getGridItemPictureId();
    }
}
