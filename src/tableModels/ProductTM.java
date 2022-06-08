package tableModels;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import models.ProductModel;


@SuppressWarnings("serial")
public class ProductTM extends AbstractTableModel {

	private List<ProductModel> rows;
	private String[] columns = new String[] {"Id", "Nome", "Estoque", "Valor"};
	private List<ProductModel> list;

	// CONSTRUTOR
	public ProductTM() {
	}
	
	public ProductTM(List<ProductModel> list) {
		rows = new ArrayList<ProductModel>(list);
	}
	
	// GETTERS E SETTERS
	public List<ProductModel> getRows() {
		return rows;
	}

	public void setRows(List<ProductModel> rows) {
		this.rows = rows;
	}

	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
	}

	public List<ProductModel> getList() {
		return list;
	}

	public void setList(List<ProductModel> list) {
		this.list = list;
	}

	@Override
	public int getRowCount() {
		return 0;
	}

	@Override
	public int getColumnCount() {
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}

}


