public class RSAction {

    private String _description;
    private double _xp;
    private Integer _minimumLevel;
    private String _category;
    private Double _actionDuration;

    RSAction(String description, double xp, Integer minimumLevel, String category, Double actionDuration) {
        _description = description;
        _xp = xp;
        _minimumLevel = minimumLevel;
        _category = category;
        _actionDuration = actionDuration;
    }

    public Integer GetMinimumLevel() {
        return _minimumLevel;
    }

    public String GetDescription() {
        return _description;
    }

    public String GetCategory() {
        return _category;
    }

    public double GetXp() {
        return _xp;
    }

    public Double GetActionDuration() {
        return _actionDuration;
    }

    @Override
    public String toString() {
        return _description + ", " + _xp + ", " + _minimumLevel + ", " + _category;
    }
}
