package attributes;


    public class ProductManager {

        public void Add(Product product) {

            System.out.println("Product Added : "+product.get_name());
            System.out.println("Product Code : "+product.get_code());
        }

    }

