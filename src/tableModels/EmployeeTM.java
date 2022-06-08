package tableModels;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import models.EmployeeModel;


@SuppressWarnings("serial")
public class EmployeeTM extends AbstractTableModel {

	private List<EmployeeModel> rows;
	private String[] columns = new String[] {"Id", "Nome", "Email", "Cargo"};
	private List<EmployeeModel> list;

	// CONSTRUTOR
	public EmployeeTM() {
	}
	
	public EmployeeTM(List<EmployeeModel> list) {
		rows = new ArrayList<EmployeeModel>(list);
	}
	
	// GETTERS E SETTERS
	public List<EmployeeModel> getRows() {
		return rows;
	}

	public void setRows(List<EmployeeModel> rows) {
		this.rows = rows;
	}

	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
	}

	public List<EmployeeModel> getList() {
		return list;
	}

	public void setList(List<EmployeeModel> list) {
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


