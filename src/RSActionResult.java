public class RSActionResult {

    private String _description;
    private double _xp;
    private Integer _minimumLevel;
    private String _category;
    private double  _iterations;
    private double _actionDuration;

    RSActionResult(RSAction rsAction, int iterations, double actionDuration) {
        _description = rsAction.GetDescription();
        _xp = rsAction.GetXp();
        _minimumLevel = rsAction.GetMinimumLevel();
        _category = rsAction.GetCategory();
        _iterations = iterations;
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

     public double GetIterations() {
        return _iterations;
    }

    public Double GetDuration() {
        return _actionDuration;
    }

    @Override
    public String toString() {
        return _description + ", " + _xp + ", " + _minimumLevel + ", " + _category + ", " + _iterations + ", " + _actionDuration;
    }
}
