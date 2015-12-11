package telerikandroid.milen.com.gridviewproject;

public class GridItem {

    private String gridItemText;
    private int GridItemPictureId;

    public GridItem(String gridItemText, int gridItemPictureId) {
        this.setGridItemText(gridItemText);
        this.setGridItemPictureId(gridItemPictureId);
    }


    public int getGridItemPictureId() {
        return GridItemPictureId;
    }

    public void setGridItemPictureId(int gridItemPictureId) {
        GridItemPictureId = gridItemPictureId;
    }

    public String getGridItemText() {
        return gridItemText;
    }

    public void setGridItemText(String gridItemText) {
        this.gridItemText = gridItemText;
    }

}
