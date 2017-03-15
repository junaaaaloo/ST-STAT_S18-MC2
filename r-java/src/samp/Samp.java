package samp;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
public class Samp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RConnection connection = null;
		try{
			connection = new RConnection();
			String x = "5,20,0.5";
			//String vector = "c(1,2,3,4)";
            connection.eval("probToss=dbinom(" + x +")");
            double prob = connection.eval("probToss").asDouble();
            System.out.println("The probability is=" + prob);
		} catch(RserveException e) {
			e.printStackTrace();
		} catch(REXPMismatchException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}

}
