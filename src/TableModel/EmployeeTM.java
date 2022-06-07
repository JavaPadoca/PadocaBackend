package TableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import models.EmployeeModel;

// ARRUMAR CLASSE (caso seja necessario)

public class EmployeeTM extends AbstractTableModel {

	private List<EmployeeModel> linhas;
	private String[] colunas = new String[] {"Id", "Nome", "Email", "Cargo"};
//	private list<EmployeeModel> lista;

//	public EmployeeTM(list<EmployeeModel> lista) {
//		linhas = new ArrayList<EmployeeModel>(lista);
//	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	

}


