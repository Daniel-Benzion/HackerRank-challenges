import java.util.*;

// TODO: complete this object/class

public class PaginationHelper<I> {
  
  private List<List<I>> list;
  private int itemCount;
  private int pageCount;
  private int iPP;
  

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    List<List<I>> temp = new ArrayList<>();
    
    List<I> helper = new ArrayList<>();
    int count = 0;
    
    for (int i = 0; i < collection.size(); i++) {
      helper.add(collection.get(i));
      count++;
      if (count == itemsPerPage) {
        temp.add(helper);
        count = 0;
        helper.clear();
      }
      if (i == collection.size() - 1 && count != 0) temp.add(helper); 
    }
    this.list = temp;
    this.itemCount = collection.size();
    this.pageCount = temp.size();
    this.iPP = itemsPerPage;
  }
  
  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return itemCount;
  }
  
  /**
   * returns the number of pages
   */
  public int pageCount() {
    return pageCount;
  }
  
  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    if (pageIndex >= pageCount || pageIndex < 0 || pageCount == 0) return -1;
    if (pageIndex == list.size() - 1) {
      return (list.get(pageIndex)).size();
    }
    return iPP;
  }
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    if (itemIndex < 0 || itemIndex > itemCount - 1 || pageCount == 0) return -1;
    
    int start = 0;
    int end = 0;
    int page = 0;
    
    
    while (true) {
      end = start + iPP;
      if (itemIndex >= start && itemIndex <= end) return page;
      page++;
      start = end;
    }
    
    
  }
}
