public class Cliente {

    // Propiedades
    private String idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String eMail;

    // Constructores
    public Cliente() {
    }

    public Cliente(String id, String nom, String dir, String tel, String em) {
        this.idCliente = id;
        this.nombre = nom;
        this.direccion = dir;
        this.telefono = tel;
        this.eMail = em;
    }

    // getter -setter
    public String getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(String i) {
        this.idCliente = i;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String d) {
        this.direccion = d;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String t) {
        this.telefono = t;
    }

    public String getEMail() {
        return this.eMail;
    }

    public void setEMail(String e) {
        this.eMail = e;
    }

    // public Cliente(String idCliente, String nombre, String direccion, String
    // telefono, String eMail) {
    // this.idCliente = idCliente;
    // this.nombre = nombre;
    // this.direccion = direccion;
    // this.telefono = telefono;
    // this.eMail = eMail;
    // }

    // // getter-setter
    // public String getIdCliente() {
    // return idCliente;
    // }

    // public void setIdCliente(String idCliente) {
    // this.idCliente = idCliente;
    // }

    // public String getNombre() {
    // return nombre;
    // }

    // public void setNombre(String nombre) {
    // this.nombre = nombre;
    // }

    // public String getDireccion() {
    // return direccion;
    // }

    // public void setDireccion(String direccion) {
    // this.direccion = direccion;
    // }

    // public String getTelefono() {
    // return telefono;
    // }

    // public void setTelefono(String telefono) {
    // this.telefono = telefono;
    // }

    // public String geteMail() {
    // return eMail;
    // }

    // public void seteMail(String eMail) {
    // this.eMail = eMail;
    // }

}
