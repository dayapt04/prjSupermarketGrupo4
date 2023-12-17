public class Producto {
    private int idProducto;
    private String codigo;
    private String nombre;
    private Float precioVenta;
    private Float precioCompra;
    private int stock;

    public Producto(int idProducto, String codigo, String nombre, Float precioVenta, Float precioCompra, int stock) {
        this.idProducto = idProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.stock = stock;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    static Producto[] producto = new Producto[20]; 

    public void VerProductosSupermarket(){
        listaProductos();
        BasedeDatos();
    }

    public void listaProductos(){
        Producto producto1 = new Producto(1, "001AMN","Agua", 0.40f, 0.35f, 40);
        Producto producto2 = new Producto(2, "002CCG","Gaseosa", 0.64f, 0.57f, 40);
        Producto producto3 = new Producto(3, "003PDI","Pan", 2.03f, 1.77f, 25);
        Producto producto4 = new Producto(4, "004HRN","Harina", 2.19f, 1.97f, 40);
        Producto producto5 = new Producto(5, "005AZR","Azucar", 1.01f, 0.96f, 50);
        Producto producto6 = new Producto(6, "006ACE","Aceite", 4.95f, 2.97f, 50);
        Producto producto7 = new Producto(7, "007PHS","Huevos", 2.89f, 2.62f, 30);
        Producto producto8 = new Producto(8, "008ESM","Salsas", 2.18f, 1.89f, 55);
        Producto producto9 = new Producto(9, "009PLL","Pollo", 7.24f, 5.98f, 30);
        Producto producto10 = new Producto(10, "010CRN","Carne", 7.09f, 5.87f, 30);
        Producto producto11 = new Producto(11, "011ATN","Atun", 1.51f, 1.27f, 30);
        Producto producto12 = new Producto(12, "012GDO","Galleta", 1.81f, 1.39f, 50);
        Producto producto13 = new Producto(13, "013TMT","Tomate", 1.74f, 1.54f, 60);
        Producto producto14 = new Producto(14, "014CBL","Cebolla", 1.58f, 1.34f, 60);
        Producto producto15 = new Producto(15, "015LMN","Limones", 1.78f, 1.49f, 50);
        producto[0] = producto1;
        producto[1] = producto2;
        producto[2] = producto3;
        producto[3] = producto4;
        producto[4] = producto5;
        producto[5] = producto6;
        producto[6] = producto7;
        producto[7] = producto8;
        producto[8] = producto9;
        producto[9] = producto10;
        producto[10] = producto11;
        producto[11] = producto12;
        producto[12] = producto13;
        producto[13] = producto14;
        producto[14] = producto15;
    }

    public void BasedeDatos(){
        System.out.println("\n--------------------------------------| Base de datos |--------------------------------------\n");
        System.out.printf("ID\tCÓDIGO\t\tNOMBRE\t\tSTOCK\t\tPRECIO COMPRA\t\tPRECIO VENTA\n");

        for (int i = 0; i < 15; i++) {
            if (producto[i] != null) {
                System.out.printf("%d\t%s\t\t%s\t\t %d\t\t    $ %.2f\t\t   $ %.2f\n",producto[i].getIdProducto(), producto[i].getCodigo(), 
                producto[i].getNombre(),producto[i].getStock(), producto[i].getPrecioCompra(), producto[i].getPrecioVenta());
            }
        }
        System.out.println("\n--------------------------------------------------------------------------------------------\n");
    }
}