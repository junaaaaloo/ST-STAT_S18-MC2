package samp;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
public class Samp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RConnection connection = null;
		String place = "C:\\\\Users\\\\Angel\\\\Documents\\\\2nd year - 2nd Term\\\\ST-STAT\\\\ST-STAT_S18-MC2\\\\r-java";
		try{
			connection = new RConnection();
			//String x = "5,20,0.5";
			String vector = "c(5,1)";
		/*	connection.eval("x = "+vector);
            connection.eval("probToss=mean(x)");
            int prob = connection.eval("probToss").asInteger();
            int[] num = connection.eval("x").asIntegers();
            for(int i:num)
            	System.out.println(i);
            System.out.println("The probability is=" + prob);*/
			connection.eval("source('"+place+"\\\\process.R')");
			connection.eval("numbers = rbinom(30,100,0.5)");
			int[] num = connection.eval("numbers").asIntegers();
			for(int j:num)
            	System.out.println(j);
			double probability = connection.eval("binomial(100,0.5,numbers)").asDouble();
			System.out.println("The probability is=" + probability);
			double[] prob = connection.eval("binomialProb(100,0.5,numbers)").asDoubles();
			for(double i:prob)
            	System.out.println(i);
		} catch(RserveException e) {
			e.printStackTrace();
		} catch(REXPMismatchException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}

}
