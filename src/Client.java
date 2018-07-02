import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Child c = new Child();
        Child.ItemList itemList = c.get(null);
        Child.ItemList itemList1 = c.get("1");
        Child.ItemList itemList2 = c.get("");

        List<Child.ItemList> list = new ArrayList<>();
        list.add(itemList);
        list.add(itemList1);
        list.add(itemList2);

        for (Child.ItemList ele : list) {
            if (ele == null) {
                System.out.println("null");
            } else if (ele.getList().size() == 0) {
                System.out.println(0);
            } else {
                c.debug(ele);
            }

        }

        c.save(itemList2);
        c.update("3", 12);
        c.delete("3");
    }

}
