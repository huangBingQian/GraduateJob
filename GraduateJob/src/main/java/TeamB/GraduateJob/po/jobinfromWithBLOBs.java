package TeamB.GraduateJob.po;

public class jobinfromWithBLOBs extends jobinfrom {
    private String demand;

    private String functions;

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand == null ? null : demand.trim();
    }

    public String getFunctions() {
        return functions;
    }

    public void setFunctions(String functions) {
        this.functions = functions == null ? null : functions.trim();
    }
}