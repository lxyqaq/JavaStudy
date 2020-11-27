package skeletons.Q2;

class SteppedValue extends SingleValue {

    private int step;

    public SteppedValue(int v1, int s) {
        super(v1);
        this.step = s;
    }

    public int readStep(){
        return step;
    }

    public void stepUpValue1() {
        value1 += step;
    }

    public void updateStep(int v){
        this.step = v;
    }
}