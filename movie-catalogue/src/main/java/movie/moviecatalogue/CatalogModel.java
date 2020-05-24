package movie.moviecatalogue;

import java.util.ArrayList;
import java.util.List;

public class CatalogModel {

	private String user;
	private List<CatalogItem> list=new ArrayList<CatalogItem>();
	public CatalogModel() {
		super();
	}
	
	public CatalogModel(String user, List<CatalogItem> list) {
		super();
		this.user = user;
		this.list = list;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public List<CatalogItem> getList() {
		return list;
	}

	public void setList(List<CatalogItem> list) {
		this.list = list;
	}
	
	
	
	
}
