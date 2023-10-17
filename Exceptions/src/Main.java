import java.util.Date;
import java.util.Random;

class JobImpossible extends Exception{
String reason;

public JobImpossible(String reason) {
    super("Job impossible because: " + reason);
    this.reason = reason;
 }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

class WorkerIsBusy extends JobImpossible {
    public WorkerIsBusy(String reason) {
        super(reason);
    }

    Date finishWork;
    String workDescription;

    public Date getFinishWork() {
        return finishWork;
    }

    public void setFinishWork(Date finishWork) {
        this.finishWork = finishWork;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }
}

class ForseMajor extends JobImpossible {
    public ForseMajor(String reason) {
        super(reason);
    }

    double damage;
    String forseMajorDescription;

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public String getForseMajorDescription() {
        return forseMajorDescription;
    }

    public void setForseMajorDescription(String forseMajorDescription) {
        this.forseMajorDescription = forseMajorDescription;
    }
}

class ToolsCrush extends JobImpossible {
    public ToolsCrush(String reason) {
        super(reason);
    }

    String toolsCrushDescription;

    public String getToolsCrushDescription() {
        return toolsCrushDescription;
    }

    public void setToolsCrushDescription(String toolsCrushDescription) {
        this.toolsCrushDescription = toolsCrushDescription;
    }
}

class Worker {
    private boolean isWorking = false;

    public void works() throws WorkerIsBusy, ToolsCrush {
        if (isWorking) {
            throw new WorkerIsBusy("Worker is busy");
        } else {
            if (verificateTools()) {
                isWorking = true;
                System.out.println("Worker start works");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isWorking = false;
                System.out.println("Worker finish works");
            } else {
                throw new ToolsCrush("Oh no my Tools crush");
            }
        }
    }

    public boolean verificateTools() {
        Random random = new Random();
        int num = random.nextInt(2);
        return num != 0;
    }
}

public class Main {
    public static void main(String[] args) {
            Worker worker = new Worker();
        try {
            worker.works();
        } catch (WorkerIsBusy | ToolsCrush e) {
            e.printStackTrace();
        }
    }
    }
