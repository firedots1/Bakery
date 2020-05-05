import java.lang.StringBuffer;
    public class BakedGoods {
        private String name;
        private double price;
        private String expDate;
        private int quantity;
        private String dietRestrictionsMet;
        private String type;

        public BakedGoods() {
        }

        public BakedGoods(String name, double price, String expDate, int quantity, String dietRestrictionsMet, String type) {
            this.name = name;
            this.price = price;
            this.expDate = expDate;
            this.quantity = quantity;
            this.dietRestrictionsMet = dietRestrictionsMet;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getExpDate() {
            return expDate;
        }

        public void setExpDate(String expDate) {
            this.expDate = expDate;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getDietRestrictionsMet() {
            return dietRestrictionsMet;
        }

        public void setDietRestrictionsMet(String dietRestrictionsMet) {
            this.dietRestrictionsMet = dietRestrictionsMet;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String toString() {
            StringBuffer strBuffer = new StringBuffer();
            strBuffer.append("Item: " + name + " " + "Price: " + price + " " + "Exp: " + " " + expDate + " " + "Diet Restrictions: ");
            strBuffer.append(dietRestrictionsMet + "Qty: " + " " + quantity + "\n ");
            return strBuffer.toString();
        }
    }


