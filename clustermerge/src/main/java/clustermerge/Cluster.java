/**
 * 
 */
package clustermerge;

/**
 * @author Ken.Byers
 *
 */
public class Cluster {
    private int machineId;
    private int clusterId;
    
    public Cluster() {
        this.setClusterId(0);
        this.setMachineId(0);
    }
    
    public Cluster(int machineId, int clusterId) {
        super();
        this.machineId = machineId;
        this.clusterId = clusterId;
    }
    
    public Cluster(String machineId, String clusterId) {
        super();
        this.machineId = Integer.valueOf(machineId);
        this.clusterId = Integer.valueOf(clusterId);
    }
    
    public int getMachineId() {
        return machineId;
    }
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
    public int getClusterId() {
        return clusterId;
    }
    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Cluster [machineId=" + machineId + ", clusterId=" + clusterId + "]\n";
    }
    
    
}
