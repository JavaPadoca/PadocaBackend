package models;

public class ProductModel {

	private int ProductId, Storage;
    private String ProductName;
    private float Value;
    
	// CONSTRUTOR
    public ProductModel() {
    }
    
    public ProductModel(int Id, String ProductName, int Storage, float Value) {
    	this.ProductId = Id;
    	this.ProductName = ProductName;
    	this.Storage = Storage;
    	this.Value = Value;    	
    }
	
	// GETTERS E SETTERS
	public int getProductId() {
		return ProductId;
	}
	
	public void setProductId(int productId) {
		ProductId = productId;
	}
	
	public int getStorage() {
		return Storage;
	}
	
	public void setStorage(int storage) {
		Storage = storage;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public void setProductName(String productName) {
		ProductName = productName;
	}
	
	public float getValue() {
		return Value;
	}
	
	public void setValue(float value) {
		Value = value;
	}
    
}
