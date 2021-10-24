package AI;



public class Perceptron {
    float[] weight = new float[2];
    double max = 1.0;
    double min = -1.0;

    public Perceptron() {

        // intitalize the weight randomly
        for (int i = 0; i < weight.length; i++){
            weight[i] =  (float) Math.floor(Math.random()*(max-min+1)+min);
        }
    }


    int guess(float [] inputs){

        float sum = 0;

        for (int i=0; i< weight.length; i++){
            sum += inputs[i] * weight[i];
        }
        return sign(sum);
    }

    /***
     *  This is the activation functions
     * @param n
     * @return
     */
    public  int sign(float n){
        if( n > 0 )
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        Perceptron p = new Perceptron();
        float [] input = {-1,0.5f};
        int guess = p.guess(input);
        System.out.println(guess);
    }
}

