
    public class Drink {
        private Size size;
        private String name;

        public Drink(Size size, String name) {
            this.size = size;
            this.name = name;
        }

        public double calculatePrice() {
            return switch (size) {
                case SMALL -> 2;
                case MEDIUM -> 2.5;
                case LARGE -> 3;
            };
        }

        @Override
        public String toString() {
            return name + " (" + size + ")";
        }
    }