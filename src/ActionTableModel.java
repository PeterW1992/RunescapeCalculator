import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.List;

public class ActionTableModel implements TableModel {

    List<RSAction> _actions;

    ActionTableModel(List<RSAction> actions) {
        _actions = actions;
    }

    @Override
    public int getRowCount() {
        return _actions.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Level";

            case 1:
                return "Description";

            case 2:
                return "Xp";

            case 3:
                return "Iterations";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
