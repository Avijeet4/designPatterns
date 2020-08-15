package structural.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {
	private ArrayList<CatalogComponent> catalogComponents=new ArrayList<CatalogComponent>();
	private String name;
	
	public ProductCatalog(String name) {
		this.name=name;
	}
	
	@Override
	public void add(CatalogComponent catalogComponent) {
		// TODO Auto-generated method stub
		this.catalogComponents.add(catalogComponent);
	}
	public void remove(CatalogComponent catalogComponent) {
		this.catalogComponents.remove(catalogComponent);
	}
	
	@Override
	public String getName(CatalogComponent catalogComponent) {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(CatalogComponent catalogComponent:catalogComponents) {
			catalogComponent.print();
		}
	}
	
}
