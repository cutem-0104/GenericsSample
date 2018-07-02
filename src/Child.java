import java.util.ArrayList;

public class Child extends Parent<Child.ItemList> {

    @Override
    public void debug(ItemList itemList) {
        ArrayList<Item> list = itemList.getList();
        for (Item item : list) {
            System.out.println(item.getUserId());
            System.out.println(item.getName());
        }
    }

    @Override
    public ItemList getObj(String key) {
        if (key == null) {
            return null;
        }

        if ("1".equals(key)) {
            ItemList itemList = new ItemList();
            itemList.setList(new ArrayList<>());
            return itemList;
        }

        ArrayList<Item> list = new ArrayList<>();
        Item item1 = new Item(1, "taro");
        Item item2 = new Item(2, "jiro");
        Item item3 = new Item(3, "goro");
        list.add(item1);
        list.add(item2);
        list.add(item3);
        ItemList itemList = new ItemList();
        itemList.setList(list);
        return itemList;
    }

    @Override
    public ItemList updateObj(String key, long id) {
        ItemList itemList = getObj(key);
        ArrayList<Item> list = itemList.getList();
        list.add(new Item(id, null));
        itemList.setList(list);
        return itemList;
    }



    public class ItemList {
        private ArrayList<Item> list;

        public ArrayList<Item> getList() {
            return list;
        }

        public void setList(ArrayList<Item> list) {
            this.list = list;
        }

    }
    public class Item {
        private long userId;
        private String name;

        public Item(long userId, String name) {
            this.userId = userId;
            this.name = name;
        }

        public long getUserId() {
            return userId;
        }

        public void setUserId(long userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
