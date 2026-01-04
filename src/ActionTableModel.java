import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ActionTableModel implements TableModel {

    List<RSActionResult> _actions;

    ActionTableModel(List<RSActionResult> actions) {
        _actions = actions;
    }

    ActionTableModel() {
        
    }

    public ActionTableModel populateActions(List<RSAction> actions){
        this._actions = new ArrayList<RSActionResult>();
        for (RSAction action : actions) {
            this._actions.add(new RSActionResult(action, 0, 0));
        }
	 return this;
    }

    @Override
    public int getRowCount() {
        return _actions.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
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
            
            case 4:
                return "Duration";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return "".getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RSActionResult action = this._actions.get(rowIndex);

        switch (columnIndex) {
            case 0:
            return action.GetMinimumLevel();

            case 1:
                return action.GetDescription();

            case 2:
                return action.GetXp();

            case 3:
                return action.GetIterations();

            case 4:
                return action.GetDuration();
        }

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
