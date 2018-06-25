package shop_package;

import java.util.Objects;

public class Shop {

    private String address;
    private Type type;
    private Mark mark;

    public Shop(String address, Type type, String nameMark) {
        this.address = address;
        this.type = type;
        this.mark = new Mark(nameMark);
    }

    private class Mark{
        private String name;

        public Mark(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Mark{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type{
        GROCERY_STORE, BOOK_STORE, ELECTRONICS_STORE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(address, shop.address) &&
                Objects.equals(type, shop.type) &&
                Objects.equals(mark, shop.mark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(address, type, mark);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", mark=" + mark +
                '}';
    }
}
